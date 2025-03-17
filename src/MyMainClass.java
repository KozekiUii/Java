class OuterClass {
    int x = 10;
// 1.非静态内部类（内部类可以访问外部类）  
    class InnerClass {
      int y = 5;
    }
// 2.私有的内部类
    // private class InnerClass {
    //     int y = 5;
    // }
// 3.静态内部类:不需要创建外部类来访问，可以直接访问它
    // static class InnerClass {
    //     int y = 5;
    // }
  }
  
  public class MyMainClass {
    public static void main(String[] args) {
    // new 是 Java 中的关键字，用于创建一个新的对象（实例化一个类）。
    // OuterClass()类的构造方法（Constructor）。构造方法用于初始化对象。
    // 如果没有显式定义构造方法，Java 会提供一个默认的无参构造方法。
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
    //   OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    //   System.out.println(myInner.y);
    }
  }