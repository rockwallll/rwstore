package com.example.tc;

public class Coursedign {
    String cno;
    String cname;
    String csigntime;
    String csignposiL;
    String csignposiW;
    String signtimelast;
    String csigned;
    String czno;

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

    public String getCsigntime() {
        return csigntime;
    }

    public void setCsigntime(String csigntime) {
        this.csigntime = csigntime;
    }

    public String getCsignposiL() {
        return csignposiL;
    }

    public void setCsignposiL(String csignposiL) {
        this.csignposiL = csignposiL;
    }

    public String getCsignposiW() {
        return csignposiW;
    }

    public void setCsignposiW(String csignposiW) {
        this.csignposiW = csignposiW;
    }

    public String getSigntimelast() {
        return signtimelast;
    }

    public void setSigntimelast(String signtimelast) {
        this.signtimelast = signtimelast;
    }

    public String getCsigned() {
        return csigned;
    }

    public void setCsigned(String csigned) {
        this.csigned = csigned;
    }

    public String getCzno() {
        return czno;
    }

    public void setCzno(String czno) {
        this.czno = czno;
    }

    public Coursedign(String cno, String cname, String csigntime, String csignposiL, String csignposiW, String signtimelast, String csigned, String czno) {
        this.cno = cno;
        this.cname = cname;
        this.csigntime = csigntime;
        this.csignposiL = csignposiL;
        this.csignposiW = csignposiW;
        this.signtimelast = signtimelast;
        this.csigned = csigned;
        this.czno = czno;
    }
}
