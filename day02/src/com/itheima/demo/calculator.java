package com.itheima.demo;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        double num1 = sc.nextDouble();
        System.out.println("请输入运算符: +、-、*、/");
        char op = sc.next().charAt(0);
        System.out.println("请输入第二个数字");
        double num2 = sc.nextDouble();

        switch (op){
            case '+':
                System.out.println("结果为" + (num1+num2));
                break;
            case '-':
                System.out.println("结果为" + (num1-num2));
                break;
            case '*':
                System.out.println("结果为" + (num1*num2));
                break;
            case '/':
                System.out.println("结果为" + (num1/num2));
                break;
            default:
                System.out.println("输入有误");
        }
        sc.close();

    }
}
