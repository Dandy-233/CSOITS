package com.dandy.model;

/**
 * 购物车收藏关系
 * @author 李旦
 * @date 2020/3/4,15:16
 */
public class Cart {
    //用户编号
    private int uid;
    //商品编号
    private int iid;
    //商品名称
    private String iname;
    //商品描述
    private String idescribe;
    //商品价格
    private double iprice;
    //数量
    private int cnum;
    //售卖人编号
    private int sid;
    //售卖人昵称
    private String uname;

    public Cart() {
    }

    public Cart(int uid, int iid, int cnum) {
        this.uid = uid;
        this.iid = iid;
        this.cnum = cnum;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "uid=" + uid +
                ", iid=" + iid +
                ", iname='" + iname + '\'' +
                ", idescribe='" + idescribe + '\'' +
                ", iprice=" + iprice +
                ", cnum=" + cnum +
                ", sid=" + sid +
                ", uname='" + uname + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getIdescribe() {
        return idescribe;
    }

    public void setIdescribe(String idescribe) {
        this.idescribe = idescribe;
    }

    public double getIprice() {
        return iprice;
    }

    public void setIprice(double iprice) {
        this.iprice = iprice;
    }

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
