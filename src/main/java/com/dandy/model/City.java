package com.dandy.model;

/**
 * 市
 * @author 李旦
 * @date 2020/3/9,10:31
 */
public class City {
    //市编号
    private int cid;
    //市名称
    private String cname;
    //所属省编号
    private int pid;

    public City() {
    }

    public City(int cid, String cname, int pid) {
        this.cid = cid;
        this.cname = cname;
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "City{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", pid=" + pid +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
