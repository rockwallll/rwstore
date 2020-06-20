package com.example.tc;

public class Total {
    String cno;
    String cname;
    String sname;
    String snumber;
    String totalnumber;

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

    public String getTotalnumber() {
        return totalnumber;
    }

    public void setTotalnumber(String totalnumber) {
        this.totalnumber = totalnumber;
    }

    public Total(String cno, String cname, String sname, String snumber, String totalnumber) {
        this.cno = cno;
        this.cname = cname;
        this.sname = sname;
        this.snumber = snumber;
        this.totalnumber = totalnumber;
    }

    @Override
    public String toString() {
        return "  "+cno + "     " + cname + "   " + sname + ((sname.length()==3)?"  " :"     ")+ snumber + "     " + totalnumber;
    }
}
