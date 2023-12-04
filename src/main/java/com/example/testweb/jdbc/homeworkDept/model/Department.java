package com.example.testweb.jdbc.homeworkDept.model;

public class Department {

    private Integer deptNo;
    private String deptName;
    private String loc;

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("{deptNo:").append(deptNo);
        sb.append(", deptName:'").append(deptName).append('\'');
        sb.append(", loc:'").append(loc).append('\'');
        sb.append("}");
        return sb.toString();
    }
}
