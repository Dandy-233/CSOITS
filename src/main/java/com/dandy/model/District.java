package com.dandy.model;

/**
 * 区
 * @author 李旦
 * @date 2020/3/9,10:33
 */
public class District {
    //区编号
    private int did;
    //区名称
    private String dname;
    //所属市编号
    private int cid;

    public District() {
    }

    public District(int did, String dname, int cid) {
        this.did = did;
        this.dname = dname;
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "District{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", cid=" + cid +
                '}';
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
