package com.syxy.stumangementsys.service.impl;

import com.syxy.stumangementsys.controller.StudentController;
import com.syxy.stumangementsys.entities.Course;
import com.syxy.stumangementsys.entities.StudentCourse;
import com.syxy.stumangementsys.mapper.CourseMapper;
import com.syxy.stumangementsys.service.CourseService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;
    @Override
    public List<StudentCourse> getCourseList() {
        return courseMapper.getCourseList();
    }

    @Override
    public int delStuCourse(Integer sid, Integer cid) {
       int result = courseMapper.delStuCourse(sid,cid);
       if (result >0 ){
           return 200;
       }
        return 400;
    }

    @Override
    public List<StudentCourse> serchStuCourse(String name) {
        List<StudentCourse> studentCourses = courseMapper.serchStuCourse(name);

        return studentCourses;
    }

    @Override
    public StudentCourse getStuCourseById(Integer sid, Integer cid) {

        StudentCourse studentCourse = courseMapper.getStuCourseById(sid,cid);


        return studentCourse;
    }

    @Override
    public List<Course> getCourses() {
        return courseMapper.getCourses();
    }

    @Override
    public Course getCourseById(Integer cid) {

        return courseMapper.getCourseById(cid);
    }

    @Override
    public int updateStudentCourse(StudentCourse studentCourse) {
       int result = courseMapper.updateStudentCourse(studentCourse);
       if (result > 0){
           return 200;
       }
       return 400;
    }

    @Override
    public int addStudentCourse(StudentCourse studentCourse) {
       int result = courseMapper.addStudentCourse(studentCourse);
        if (result > 0){
            return 200;
        }
        return 400;
    }


}
