package com.dandy.model;

import java.util.Date;

/**
 * 购物车收藏关系
 * @author 李旦
 * @date 2020/3/4,15:16
 */
public class cart {
    //用户编号
    private int uid;
    //商品编号
    private int iid;
    //添加至购物车的时间
    private Date ctime;

    @Override
    public String toString() {
        return "cart{" +
                "uid=" + uid +
                ", iid=" + iid +
                ", ctime=" + ctime +
                '}';
    }

    public cart() {
    }

    public cart(int uid, int iid) {
        this.uid = uid;
        this.iid = iid;
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

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
