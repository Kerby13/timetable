package com.firstgroup.timetable.Repository;


import com.firstgroup.timetable.Entity.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository  extends CrudRepository <Admin, Integer> {
    Admin getAdminByLogin(String login);
}
