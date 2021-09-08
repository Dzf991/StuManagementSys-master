package com.syxy.stumangementsys.mapper;

import com.syxy.stumangementsys.entities.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {


    List<Student> getStudentList();

    int delStudent(Integer sid);

    Student getStudentById(Integer sid);

    int updateStudent(Student student);

    int insertStudent(Student student);

    List<Student> serchStu(Student student);
}
