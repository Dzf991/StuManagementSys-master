package com.syxy.stumangementsys.controller;


import com.syxy.stumangementsys.entities.Course;
import com.syxy.stumangementsys.entities.Student;
import com.syxy.stumangementsys.entities.StudentCourse;
import com.syxy.stumangementsys.service.CourseService;
import com.syxy.stumangementsys.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
       return "StuCourseMenu";
    }


    @GetMapping(value = "/goAdd")
    public String goAdd(Model model){

        List<Course> courseList = courseService.getCourses();
        List<Student> studentList = studentService.getStudentList();
        model.addAttribute("courses",courseList);
        model.addAttribute("studentList",studentList);
        return "StuCourseAdd";
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

    @GetMapping(value = "/goStuCourseUpdate/{sid}/{cid}")
    public String goStuCourseUpdate(@PathVariable(value = "sid") Integer sid,
                                    @PathVariable(value = "cid") Integer cid,
                                    Model model){
//
        Student student = studentService.getStudentById(sid);
        StudentCourse studentCourse = courseService.getStuCourseById(sid,cid);
        Course course = courseService.getCourseById(cid);
        model.addAttribute("studentCourse",studentCourse);
        model.addAttribute("students",student);
        model.addAttribute("course",course);
        return "StuCourseUpdate";
    }

    @ResponseBody
    @PostMapping(value = "/updateStudentCourse")
    public Object updateStudentCourse(StudentCourse studentCourse){
        int result = courseService.updateStudentCourse(studentCourse);
        return result;
    }

    @ResponseBody
    @PostMapping(value = "/addStudentCourse")
    public Object addStudentCourse(StudentCourse studentCourse){
       int result = courseService.addStudentCourse(studentCourse);
       return result;
    }


}
