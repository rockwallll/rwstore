package com.example.tc;

public class Student {
    String sno;
    String sname;
    String sex;
    String snumber;
    String sschool;
    String spassword;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getSschool() {
        return sschool;
    }

    public void setSschool(String sschool) {
        this.sschool = sschool;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public Student(String sno, String sname, String sex, String snumber, String sschool, String spassword) {
        this.sno = sno;
        this.sname = sname;
        this.sex = sex;
        this.snumber = snumber;
        this.sschool = sschool;
        this.spassword = spassword;
    }
}
