package com.syxy.stumangementsys.entities;

public class Account {
   private Integer aid;
   private String name;
   private String pwd;
   private String mobile;
   private String mail;

    public Account() {
    }

    public Account(Integer aid, String name, String pwd, String mobile, String mail) {
        this.aid = aid;
        this.name = name;
        this.pwd = pwd;
        this.mobile = mobile;
        this.mail = mail;
    }


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
