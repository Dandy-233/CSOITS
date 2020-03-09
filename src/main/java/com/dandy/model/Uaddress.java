package com.dandy.model;

/**
 * 用户真实收货地址
 * @author 李旦
 * @date 2020/3/9,11:55
 */
public class Uaddress {
    //用户编号
    private int uid;
    //省份名称
    private String pname;
    //市名称
    private String cname;
    //区/县名称
    private String dname;
    //详细地址
    private String detail;
    //收件人姓名
    private String aname;
    //收件人手机号
    private String aphone;

    public Uaddress() {
    }

    public Uaddress(int uid, String pname, String cname, String dname, String detail, String aname, String aphone) {
        this.uid = uid;
        this.pname = pname;
        this.cname = cname;
        this.dname = dname;
        this.detail = detail;
        this.aname = aname;
        this.aphone = aphone;
    }

    @Override
    public String toString() {
        return "Uaddress{" +
                "uid=" + uid +
                ", pname='" + pname + '\'' +
                ", cname='" + cname + '\'' +
                ", dname='" + dname + '\'' +
                ", detail='" + detail + '\'' +
                ", aname='" + aname + '\'' +
                ", aphone='" + aphone + '\'' +
                '}';
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
