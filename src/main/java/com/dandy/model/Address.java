package com.dandy.model;

/**
 * 用户地址
 * @author 李旦
 * @date 2020/3/9,10:35
 */
public class Address {
    //收货地址编号
    private int aid;
    //用户编号
    private int uid;
    //省份编号
    private int pid;
    //市编号
    private int cid;
    //区编号
    private int did;
    //街道编号
    private int sid;
    //详细地址
    private String detail;
    //收件人姓名
    private String aname;
    //收件人手机号
    private String aphone;

    public Address() {
    }

    public Address(int aid, int uid, int pid, int cid, int did, int sid, String detail, String aname, String aphone) {
        this.aid = aid;
        this.uid = uid;
        this.pid = pid;
        this.cid = cid;
        this.did = did;
        this.sid = sid;
        this.detail = detail;
        this.aname = aname;
        this.aphone = aphone;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", cid=" + cid +
                ", did=" + did +
                ", sid=" + sid +
                ", detail='" + detail + '\'' +
                ", aname='" + aname + '\'' +
                ", aphone='" + aphone + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone;
    }
}
