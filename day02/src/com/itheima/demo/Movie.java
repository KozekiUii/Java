package com.itheima.demo;

public class Movie {
    private String name;
    private String actor;
    private double price;
    private int id;
    //    定义一个无参构造器
    public Movie() {
    }

    //    定义一个有参构造器
    public Movie(String name, String actor, double price, int id) {
        this.name = name;
        this.actor = actor;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
