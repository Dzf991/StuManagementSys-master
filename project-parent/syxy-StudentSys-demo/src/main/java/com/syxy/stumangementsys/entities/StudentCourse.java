package com.syxy.stumangementsys.entities;

public class StudentCourse {
    private Integer cid;
    private Integer sid;
    private Student student;
    private Course course;
    private Integer score;


    public StudentCourse() {
    }

    public StudentCourse(Integer cid, Integer sid, Student student, Course course, Integer score) {
        this.cid = cid;
        this.sid = sid;
        this.student = student;
        this.course = course;
        this.score = score;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
