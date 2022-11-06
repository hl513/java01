package com.xxx.day08;

public class User {
    private String email;
    private String username;
    private String password;
    private String gender;
    private int age;

    public User(){
    }

    // 有参构造
    public User(String email,String username,String password,String gender,int age){
        this.email = email;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
