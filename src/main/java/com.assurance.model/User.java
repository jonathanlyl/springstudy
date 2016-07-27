package com.assurance.model;

/**
 * Author: yulongliu
 * Email:liuyulong04@meituan.com
 * Date:16/7/26
 * Time:下午4:03
 */
public class User {

    private int id;
    private int state;
    private String nickname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
