package com.firstgroup.timetable.Repository;

import com.firstgroup.timetable.Entity.Lesson;
import com.firstgroup.timetable.Entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, Integer> {
    Iterable<Lesson> getByCourseAndGroupAndIsEven(int course, String group, boolean isEven);
    Iterable<Lesson> getByCourseAndGroupAndIsEvenAndTeacher (int course, String group, boolean isEven, Teacher teacher);
}
