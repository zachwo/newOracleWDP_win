package com.reflect;

public class Student {
    private int sno;
    public String sname;
    protected String ssex;
    String sbirthday;
    static String classes;
    public static String xxx;

    public static String getXxx() {
        return xxx;
    }

    public static void setXxx(String xxx) {
        Student.xxx = xxx;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
