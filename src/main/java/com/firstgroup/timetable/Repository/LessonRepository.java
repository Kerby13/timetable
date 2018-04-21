package com.firstgroup.timetable.Repository;

import com.firstgroup.timetable.Entity.Lesson;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, Integer> {
}
