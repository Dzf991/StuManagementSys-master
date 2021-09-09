package com.syxy.stumangementsys.mapper;

import com.syxy.stumangementsys.controller.StudentController;
import com.syxy.stumangementsys.entities.StudentCourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CourseMapper {
    List<StudentController> getCourseList();

    int delStuCourse(@Param(value = "sid") Integer sid,
                     @Param(value = "cid")Integer cid);

    List<StudentCourse> serchStuCourse(String name);
}
