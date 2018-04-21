package com.firstgroup.timetable.Entity;

import java.sql.Time;

import javax.persistence.*;

@Entity
public class Lesson {
    @Id()
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column(name = "id")
    private int id;

    @Column(name="type")
    private char type;

    @Column(name = "group")
    private String group;

    @Column(name = "course")
    private int course;

    @Column(name = "room")
    private String room;

    @Column(name = "time")
    private Time time;

    @ManyToOne
    @JoinColumn(name="teacherID")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name="subjectID")
    private Subject subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
