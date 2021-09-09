package com.syxy.stumangementsys.service;

import com.syxy.stumangementsys.controller.StudentController;
import com.syxy.stumangementsys.entities.StudentCourse;

import java.util.List;

public interface CourseService {
    List<StudentController> getCourseList();

    int delStuCourse(Integer sid, Integer cid);

    List<StudentCourse> serchStuCourse(String name);

    StudentCourse getStuCourseById(Integer sid, Integer cid);
}
