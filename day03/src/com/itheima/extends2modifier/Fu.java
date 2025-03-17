package com.itheima.extends2modifier;

public class Fu {
    // private：只能本类访问
    private void privateMethod(){
        System.out.println("privateMethod");
    }
    // 缺省：本类、本包可以访问
    void defaultMethod(){
        System.out.println("defaultMethod");
    }

    // protected：本类、本包、子孙类可以访问
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

    // public：本类、本包、子类、子孙类都可以访问
    public void publicMethod(){
        System.out.println("publicMethod");
    }
//    public static void main(String[] args) {
//        Fu fu = new Fu();
//        fu.privateMethod();
//        fu.defaultMethod();
//        fu.protectedMethod();
//        fu.publicMethod();
//    }
}
