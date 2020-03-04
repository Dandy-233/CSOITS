package com.dandy.model;

/**
 * 用户
 * @author 李旦
 * @date 2020/3/3,9:29
 */
public class User {
    //用户编号
    private int uid;
    //用户名
    private String username;
    //用户密码
    private String password;
    //用户性别
    private String usex;
    //用户昵称
    private String uname;
    //用户个人描述
    private String unote;
    //用户生日
    private String ubirth;
    //用户手机号
    private String uphone;
    //用户邮箱
    private String uemail;

    public User() {
    }

    public User(int uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", usex='" + usex + '\'' +
                ", uname='" + uname + '\'' +
                ", unote='" + unote + '\'' +
                ", ubirth='" + ubirth + '\'' +
                ", uphone='" + uphone + '\'' +
                ", uemail='" + uemail + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUnote() {
        return unote;
    }

    public void setUnote(String unote) {
        this.unote = unote;
    }

    public String getUbirth() {
        return ubirth;
    }

    public void setUbirth(String ubirth) {
        this.ubirth = ubirth;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }
}
