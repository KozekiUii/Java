package com.itheima.staticmethod;

public class Student {
    private double score;
//    静态方法
    public static void printhelloworld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
//    实例方法,只能在对象中访问
    public void printPass(){
        System.out.println(score>=60 ? "pass" : "fail");
    }

    public void setScore(double score){
        this.score = score;
    }
}
