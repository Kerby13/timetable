package com.firstgroup.timetable.Repository;

import com.firstgroup.timetable.Entity.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Integer> {
}
