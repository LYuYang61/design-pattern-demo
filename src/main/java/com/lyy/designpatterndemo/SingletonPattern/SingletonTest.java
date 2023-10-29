package com.lyy.designpatterndemo.SingletonPattern;

import com.lyy.designpatterndemo.SingletonPattern.sp.*;

/**
 * 单例模式测试
 */
public class SingletonTest {
    public static void main(String[] args) {

        // 1、饿汉式单例模式
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();
        singleton1.show();
        System.out.println(singleton1 == singleton11);

        System.out.println("=============================");

        // 2、懒汉式单例模式 -- 线程不安全
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton21 = Singleton2.getInstance();
        singleton2.show();
        System.out.println(singleton2 == singleton21);

        System.out.println("=============================");

        // 3、懒汉式单例模式 -- Synchronize
        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton3 singleton31 = Singleton3.getInstance();
        singleton3.show();
        System.out.println(singleton3 == singleton31);

        System.out.println("=============================");

        // 4、懒汉式单例模式 -- 双重检查锁
        Singleton4 singleton4 = Singleton4.getInstance();
        Singleton4 singleton41 = Singleton4.getInstance();
        singleton4.show();
        System.out.println(singleton4 == singleton41);

        System.out.println("=============================");

        // 5、懒汉式单例模式 -- volatile
        Singleton5 singleton5 = Singleton5.getInstance();
        Singleton5 singleton51 = Singleton5.getInstance();
        singleton5.show();
        System.out.println(singleton5 == singleton51);

        System.out.println("=============================");

        // 6、懒汉式单例模式 -- 静态内部类
        Singleton6 singleton6 = Singleton6.getInstance();
        Singleton6 singleton61 = Singleton6.getInstance();
        singleton6.show();
        System.out.println(singleton6 == singleton61);

        System.out.println("=============================");

        // 7、懒汉式单例模式 -- 枚举
        Singleton7 singleton7 = Singleton7.INSTANCE;
        Singleton7 singleton71 = Singleton7.INSTANCE;
        singleton7.show();
        System.out.println(singleton7 == singleton71);
    }
}
