package com.personal.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserSay {
    private String id;
    private String userName;
    private String userTitle;
    private String userSay;
    private Date userSayTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getUserSay() {
        return userSay;
    }

    public void setUserSay(String userSay) {
        this.userSay = userSay;
    }

    public Date getUserSayTime() {
        return userSayTime;
    }

    public void setUserSayTime(Date userSayTime) {
        this.userSayTime = userSayTime;
    }
    @Override
    public String toString() {
        return "UserSay{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userTitle='" + userTitle + '\'' +
                ", userSay='" + userSay + '\'' +
                ", userSayTime=" + userSayTime +
                '}';
    }
}
