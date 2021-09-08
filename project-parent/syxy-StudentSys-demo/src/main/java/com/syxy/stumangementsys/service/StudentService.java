package com.syxy.stumangementsys.service;

import com.syxy.stumangementsys.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentList();

    int delStudent(Integer sid);

    Student getStudentById(Integer sid);

    int updateStudnt(Student student);

    int insertStudnt(Student student);

    List<Student> serchStu(Student student);
}
