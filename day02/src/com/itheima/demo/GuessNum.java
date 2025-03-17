package com.itheima.demo;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100+1);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入一个数字");
            int guess = sc.nextInt();
            if(guess == num){
                System.out.println("恭喜你猜对了");
                break;
            }else if(guess > num){
                System.out.println("猜大了");
            }else{
                System.out.println("猜小了");
            }
        }
        sc.close();
    }
}
