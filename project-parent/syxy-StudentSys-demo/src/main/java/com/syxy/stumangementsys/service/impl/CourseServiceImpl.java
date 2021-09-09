package com.syxy.stumangementsys.service.impl;

import com.syxy.stumangementsys.controller.StudentController;
import com.syxy.stumangementsys.mapper.CourseMapper;
import com.syxy.stumangementsys.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;
    @Override
    public List<StudentController> getCourseList() {
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
}
