package com.syxy.stumangementsys.controller;


import com.syxy.stumangementsys.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

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
}
