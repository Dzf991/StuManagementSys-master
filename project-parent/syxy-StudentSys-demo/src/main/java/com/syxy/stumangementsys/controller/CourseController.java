package com.syxy.stumangementsys.controller;


import com.syxy.stumangementsys.entities.Course;
import com.syxy.stumangementsys.entities.Student;
import com.syxy.stumangementsys.entities.StudentCourse;
import com.syxy.stumangementsys.service.CourseService;
import com.syxy.stumangementsys.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    private CourseService courseService;
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/goCourseMenu")
    public String goCourseMenu(){
       return "CourseMenu";
    }
    @ResponseBody
    @GetMapping(value = "/getCourseList")
    public Object getCourseList(){

        return  courseService.getCourseList();
    }

    @ResponseBody
    @GetMapping(value = "/delStuCourse/{sid}/{cid}")
    public Object delStuCourse(@PathVariable(value = "sid") Integer sid ,
                               @PathVariable(value = "cid") Integer cid){
        int code = courseService.delStuCourse(sid, cid);
        return code;
    }
    @ResponseBody
    @GetMapping(value = "/serchStuCourse")
    public Object serchStuCourse(String name){
       List<StudentCourse> studentControllers = courseService.serchStuCourse(name);
       return studentControllers;
    }

    @ResponseBody
    @GetMapping(value = "/goStuCourseUpdate/{sid}/{cid}")
    public String goStuCourseUpdate(@PathVariable(value = "sid") Integer sid ,
                                    @PathVariable(value = "cid") Integer cid,
                                    Model model){

        List<Student> students = studentService.getStudentList();
        StudentCourse studentCourse = courseService.getStuCourseById(sid,cid);
        List<Course> courses = courseService.getCourses();
        model.addAttribute("studentCourse",studentCourse);
        model.addAttribute("students",students);
        model.addAttribute("courses",courses);
        return "StuCourseUpdate";
    }
}
