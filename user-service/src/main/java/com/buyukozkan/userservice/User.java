package com.buyukozkan.userservice;

public class User {

    private String userId;
    private String userName;
    private String phoneNumber;

    public User(String userId, String userName, String phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    // Default constructor is needed for Jackson to deserialize JSON
    public String getUserId() {
        return userId;
    }

    // setter is needed for Jackson to deserialize JSON
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    


}
