package com.dandy.model;

import java.util.Date;

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
    //数量
    private int cnum;
    //商品名称
    private String iname;
    //商品描述
    private String idescribe;
    //商品价格
    private double iprice;
    //商品上架时间
    private Date itime;
    //商品图片
    private String ipic;
    //售卖人编号
    private int sid;
    //售卖人昵称
    private String uname;
    //商品状态
    private int status;

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
                ", cnum=" + cnum +
                ", iname='" + iname + '\'' +
                ", idescribe='" + idescribe + '\'' +
                ", iprice=" + iprice +
                ", itime=" + itime +
                ", ipic='" + ipic + '\'' +
                ", sid=" + sid +
                ", uname='" + uname + '\'' +
                ", status=" + status +
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

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
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

    public Date getItime() {
        return itime;
    }

    public void setItime(Date itime) {
        this.itime = itime;
    }

    public String getIpic() {
        return ipic;
    }

    public void setIpic(String ipic) {
        this.ipic = ipic;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
