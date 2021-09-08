package com.syxy.stumangementsys.controller;

import com.syxy.stumangementsys.entities.Student;
import com.syxy.stumangementsys.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/goStuMenu")
    public String goStuMenu(){
        return "StuMenu";
    }



    @ResponseBody
    @GetMapping(value = "/getStudentList")
    public Object getStudentList(){
       List<Student> studentList = studentService.getStudentList();
       return studentList;
    }

    @GetMapping(value = "/goStuUpdate")
    public String goStuUpdate(Model model, Integer sid){

        Student student = studentService.getStudentById(sid);
        model.addAttribute("stu",student);
        return "StuUpdate";
    }

    @GetMapping(value = "/goAdd")
    public String goAdd(){
        return "StuAdd";
    }

    @ResponseBody
    @PostMapping(value = "/saveStudent")
    public Object saveStudent(Student student){
        int code = studentService.updateStudnt(student);
        return code;

    }

    @ResponseBody
    @PostMapping(value = "/addStudent")
    public Object addStudent(Student student){
        int code = studentService.insertStudnt(student);
        return code;

    }

    @ResponseBody
    @GetMapping(value = "/delStu")
    public Object delStudent(Integer sid){
       int code = studentService.delStudent(sid);
        return code;
    }

    @ResponseBody
    @GetMapping(value = "/serchStu")
    public Object serchStu(Student student){
       List<Student> students = studentService.serchStu(student);
       return students;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {

        //转换日期
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }

}
