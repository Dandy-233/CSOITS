package com.dandy.model;

/**
 * 省份
 * @author 李旦
 * @date 2020/3/9,10:29
 */
public class Province {
    //省份编号
    private int pid;
    //省份名称
    private String pname;

    public Province() {
    }

    public Province(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Province{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
