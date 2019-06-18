package com.googlecode.aviator.example;

/**
 * Created with aviator
 *
 * @description:
 * @author: chenyuan
 * @date: 2019/6/18
 * @time: 8:29 PM
 */
public class User {
    private String userName;
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String userName, String address) {
        this.userName = userName;
        this.address = address;
    }

}
