package com.tyw.learnjava;

public class LoadingOrderTest {
  public static void main(String[] args) {
    new Child2();
  }
}
class Parent2 {
  //静态变量
  private static String parentStaticStr = initParentStatic();
  private static String initParentStatic() {
    System.out.println("初始化父类静态变量");
    return "parentStaticStr";
  }

  //成员变量
  private String parentNormalStr = initParentNormal();
  private String initParentNormal() {
    System.out.println("初始化父类成员变量");
    return "parentNormalStr";
  }

  //静态块
  static {
    System.out.println("父类静态块执行");
  }

  //构造方法
  public Parent2() {
    System.out.println("父类构造执行");
  }
}

class Child2 extends  Parent2{

  //静态变量
  private static  String childStaticStr = initChildStatic();
  private static String initChildStatic() {
    System.out.println("初始化子类静态变量");
    return "childStaticStr";
  }

  //成员变量
  private String normalStr = initChildNormal();
  private String initChildNormal() {
    System.out.println("初始化子类成员变量");
    return "childNormalStr";
  }

  //静态块
  static {
    System.out.println("子类静态块执行");
  }

  //构造方法
  Child2() {
    System.out.println("子类构造执行");
  }

}