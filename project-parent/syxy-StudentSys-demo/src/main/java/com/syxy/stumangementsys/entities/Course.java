package com.syxy.stumangementsys.entities;

public class Course {

    private Integer cid;
    private String name;
    private String  desc;
    private Integer credit;


    public Course() {
    }

    public Course(Integer cid, String name, String desc, Integer credit) {
        this.cid = cid;
        this.name = name;
        this.desc = desc;
        this.credit = credit;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}
