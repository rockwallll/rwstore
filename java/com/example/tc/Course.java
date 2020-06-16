package com.example.tc;

public class Course {
    String cno;
    String cname;
    String sname;
    String snumber;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public Course(String cno, String cname, String sname, String snumber) {

        this.cno = cno;
        this.cname = cname;
        this.sname = sname;
        this.snumber = snumber;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", sname='" + sname + '\'' +
                ", snumber='" + snumber + '\'' +
                '}';
    }
}
