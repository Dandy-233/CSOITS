package com.dandy.model;

/**
 * 街道、镇、乡
 * @author 李旦
 * @date 2020/3/9,12:43
 */
public class Street {
    //乡、镇、街道编号
    private int sid;
    //乡、镇、街道名称
    private String sname;
    //所属区、县编号
    private int did;

    public Street() {
    }

    public Street(int sid, String sname, int did) {
        this.sid = sid;
        this.sname = sname;
        this.did = did;
    }

    @Override
    public String toString() {
        return "Street{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", did=" + did +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }
}
