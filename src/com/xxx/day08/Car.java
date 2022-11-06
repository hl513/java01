package com.xxx.day08;

public class Car {
    /*
     * 需求：
     *   定义数组存储3部汽车对象
     *   汽车的属性：品牌、价格、颜色
     *   创建汽车对象，数据通过键盘录入而来，并把数据存入数组当中
     * */
    private String brand;
    private double price;
    private String color;


    // 键盘录入
    /*
     * 第一套体系
     *   nextInt() 接收整数
     *   nextDouble()  接收小数
     *   next() 接收字符串
     * 遇到空格、制表符】回车就停止接收，这些符号后面的数据就不会接受了
     *
     * 第二套体系
     *   nextLine() 接收字符串
     * 可以接收空格，制表符，遇到回车才停止接收数据
     * */


    public Car() {
    }

    public Car(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Goods02{brand = " + brand + ", price = " + price + ", color = " + color + "}";
    }






}
