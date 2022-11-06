package com.xxx.exam12;

public class User {
    private String userName;
    private String passWord;
    private String card;
    private String phoneNumber;


    public User() {
    }

    public User(String userName, String passWord, String card, String phoneNumber) {
        this.userName = userName;
        this.passWord = passWord;
        this.card = card;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取
     * @return card
     */
    public String getCard() {
        return card;
    }

    /**
     * 设置
     * @param card
     */
    public void setCard(String card) {
        this.card = card;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "User{userName = " + userName + ", passWord = " + passWord + ", card = " + card + ", phoneNumber = " + phoneNumber + "}";
    }
}
