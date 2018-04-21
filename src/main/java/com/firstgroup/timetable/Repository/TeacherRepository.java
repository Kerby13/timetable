package com.firstgroup.timetable.Repository;

import com.firstgroup.timetable.Entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Integer> {
}
