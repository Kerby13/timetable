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
    private int type;

    @Column(name="teacherId")
    private int teacherId;

    @Column(name = "subjectId")
    private int subjectId;

    @Column(name = "group")
    private String group;

    @Column(name = "course")
    private int course;

    @Column(name = "room")
    private int room;

    @Column(name = "time")
    private Time time;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
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

    public void setType(int type) {
        this.type = type;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
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

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
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
