package com.dandy.model;

/**
 * //真实地址
 * @author 李旦
 * @date 2020/3/10,9:28
 */
public class Uaddress {
    //收货地址编号
    private int aid;
    //用户编号
    private int uid;
    //省份名称
    private String pname;
    //市名称
    private String cname;
    //区名称
    private String dname;
    //街道名称
    private String sname;
    //详细地址
    private String detail;
    //收件人姓名
    private String aname;
    //收件人手机号
    private String aphone;

    public Uaddress() {
    }

    public Uaddress(int aid, int uid, String pname, String cname, String dname, String sname, String detail, String aname, String aphone) {
        this.aid = aid;
        this.uid = uid;
        this.pname = pname;
        this.cname = cname;
        this.dname = dname;
        this.sname = sname;
        this.detail = detail;
        this.aname = aname;
        this.aphone = aphone;
    }

    @Override
    public String toString() {
        return "Uaddress{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", pname='" + pname + '\'' +
                ", cname='" + cname + '\'' +
                ", dname='" + dname + '\'' +
                ", sname='" + sname + '\'' +
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

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
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
