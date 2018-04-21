package com.firstgroup.timetable.Repository;

import com.firstgroup.timetable.Entity.Lesson;
import com.firstgroup.timetable.Entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, Integer> {
    Iterable<Lesson> getByCourseAndGroup(int course, String group);
    Iterable<Lesson> getByCourseAndGroupAndTeacher (int course, String group, Teacher teacher);
}
