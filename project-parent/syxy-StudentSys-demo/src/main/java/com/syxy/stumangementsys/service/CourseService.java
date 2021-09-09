package com.syxy.stumangementsys.service;

import com.syxy.stumangementsys.controller.StudentController;

import java.util.List;

public interface CourseService {
    List<StudentController> getCourseList();

    int delStuCourse(Integer sid, Integer cid);
}
