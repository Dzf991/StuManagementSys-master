package com.syxy.stumangementsys.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Student {
   private Integer sid;
   private String no;
   private String name;
   @JsonFormat(
           pattern = "yyyy-MM-dd",
           timezone = "GTM+8"
   )
   private Date birthday;
   private String hobby;
   private String image;
   private Integer age;


    public Student() {
    }

    public Student(Integer sid, String no, String name, Date birthday, String hobby, String image,Integer age) {
        this.sid = sid;
        this.no = no;
        this.name = name;
        this.birthday = birthday;
        this.hobby = hobby;
        this.image = image;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
