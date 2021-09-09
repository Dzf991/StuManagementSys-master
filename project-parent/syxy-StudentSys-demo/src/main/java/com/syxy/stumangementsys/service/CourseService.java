package com.syxy.stumangementsys.service;

import com.syxy.stumangementsys.controller.StudentController;
import com.syxy.stumangementsys.entities.Course;
import com.syxy.stumangementsys.entities.StudentCourse;

import java.util.List;

public interface CourseService {
    List<StudentCourse> getCourseList();

    int delStuCourse(Integer sid, Integer cid);

    List<StudentCourse> serchStuCourse(String name);

    StudentCourse getStuCourseById(Integer sid, Integer cid);

    List<Course> getCourses();

    Course getCourseById(Integer cid);

    int updateStudentCourse(StudentCourse studentCourse);

    int addStudentCourse(StudentCourse studentCourse);
}
