package com.firstgroup.timetable.Service;

import com.firstgroup.timetable.Entity.Admin;
import com.firstgroup.timetable.Entity.Lesson;
import com.firstgroup.timetable.Entity.Teacher;
import com.firstgroup.timetable.Repository.AdminRepository;
import com.firstgroup.timetable.Repository.LessonRepository;
import com.firstgroup.timetable.Repository.SubjectRepository;
import com.firstgroup.timetable.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Collections;
import java.util.Optional;

@Service
public class TimetableService {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private LessonRepository lessonRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    Admin getAdminByLogin(String login) {
        return adminRepository.getAdminByLogin(login);
    }

    void addAdmin(String login, String password) {
        Admin admin = new Admin();
        admin.setLogin(login);
        admin.setPassword(password);
        adminRepository.save(admin);
    }

    Iterable<Lesson> getLessonsByCourseAndGroup(int course, String group) {
        return lessonRepository.getByCourseAndGroup(course, group);
    }

    Iterable<Lesson> getLessonsByCourseAndGroupAndTeacher(int course, String group, int teacherID) {
        Optional<Teacher> teacher = teacherRepository.findById(teacherID);
        if (teacher.isPresent())
            return lessonRepository.getByCourseAndGroupAndTeacher(course, group, teacher.get());
        else
            return Collections.EMPTY_LIST;
    }

}
