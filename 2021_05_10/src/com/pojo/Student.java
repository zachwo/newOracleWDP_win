package com.pojo;

public class Student {
    private String SNO;
    private String SNAME;
    private String SSEX;
    private String SBIRTH;
    private String CLASSES;

    @Override
    public String toString() {
        return "Student{" +
                "SNO='" + SNO + '\'' +
                ", SNAME='" + SNAME + '\'' +
                ", SSEX='" + SSEX + '\'' +
                ", SBIRTH='" + SBIRTH + '\'' +
                ", CLASSES='" + CLASSES + '\'' +
                '}';
    }

    public String getSNO() {
        return SNO;
    }

    public void setSNO(String SNO) {
        this.SNO = SNO;
    }

    public String getSNAME() {
        return SNAME;
    }

    public void setSNAME(String SNAME) {
        this.SNAME = SNAME;
    }

    public String getSSEX() {
        return SSEX;
    }

    public void setSSEX(String SSEX) {
        this.SSEX = SSEX;
    }

    public String getSBIRTH() {
        return SBIRTH;
    }

    public void setSBIRTH(String SBIRTH) {
        this.SBIRTH = SBIRTH;
    }

    public String getCLASSES() {
        return CLASSES;
    }

    public void setCLASSES(String CLASSES) {
        this.CLASSES = CLASSES;
    }
}
