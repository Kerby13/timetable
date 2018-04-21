package com.firstgroup.timetable.Entity;

import javax.persistence.*;

@Entity
public class Admin {
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    private int id;

    @Column(name = "login", unique = true)
    private String login;

    @Column(name = "password")
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
