package com.syxy.stumangementsys.service.impl;

import com.syxy.stumangementsys.entities.Student;
import com.syxy.stumangementsys.mapper.StudentMapper;
import com.syxy.stumangementsys.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudentList() {


        return studentMapper.getStudentList();
    }

    @Override
    public int delStudent(Integer sid) {
       int result = studentMapper.delStudent(sid);
       if (result > 0) {
           return 200;
       }
       return 400;
    }

    @Override
    public Student getStudentById(Integer sid) {
       Student student = studentMapper.getStudentById(sid);
       return student;
    }

    @Override
    public int updateStudnt(Student student) {
        int result = studentMapper.updateStudent(student);
        if (result > 0) {
            return 200;
        }
        return 400;
    }

    @Override
    public int insertStudnt(Student student) {
       int result = studentMapper.insertStudent(student);
        if (result > 0) {
            return 200;
        }
        return 400;
    }

    @Override
    public List<Student> serchStu(Student student) {
        return studentMapper.serchStu(student);

    }
}
