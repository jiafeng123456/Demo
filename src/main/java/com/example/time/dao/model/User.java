package com.example.time.dao.model;

public class User{

    private String userId;

    private String userName;

    private String className;

    private int score;

    public User() {

    }

    public User(String userId, String userName, String className, int score) {
        this.userId = userId;
        this.userName = userName;
        this.className = className;
        this.score = score;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}