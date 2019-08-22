package com.test.pojo;

public class student {
    private String sid;
    private String sname;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
