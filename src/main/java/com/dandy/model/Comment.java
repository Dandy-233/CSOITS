package com.dandy.model;

import java.util.Date;

/**
 * 商品的评论
 * @author 李旦
 * @date 2020/3/4,18:01
 */
public class Comment {
    //商品编号
    private int iid;
    //评论者编号
    private int uid;
    //评论时间
    private Date ctime;
    //评论内容
    private String ctext;

    @Override
    public String toString() {
        return "Comment{" +
                "iid=" + iid +
                ", uid=" + uid +
                ", ctime=" + ctime +
                ", ctext='" + ctext + '\'' +
                '}';
    }

    public Comment() {
    }

    public Comment(int iid, int uid, String ctext) {
        this.iid = iid;
        this.uid = uid;
        this.ctext = ctext;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getCtext() {
        return ctext;
    }

    public void setCtext(String ctext) {
        this.ctext = ctext;
    }
}
