package com.example.tc;

public class Stusign {
    String cno;
    String snumber;
    String czno;
    String stusigntime;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getCzno() {
        return czno;
    }

    public void setCzno(String czno) {
        this.czno = czno;
    }

    public String getStusigntime() {
        return stusigntime;
    }

    public void setStusigntime(String stusigntime) {
        this.stusigntime = stusigntime;
    }

    public Stusign(String cno, String snumber, String czno, String stusigntime) {
        this.cno = cno;
        this.snumber = snumber;
        this.czno = czno;
        this.stusigntime = stusigntime;
    }
}
