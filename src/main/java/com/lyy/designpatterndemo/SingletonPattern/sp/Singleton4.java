package com.lyy.designpatterndemo.SingletonPattern.sp;

/**
 * 懒汉式单例模式 -- 双重检查锁
 * 1.检查变量是否被初始化(不去争夺锁)，如果已被初始化则立即返回。
 * 2.获取锁。
 * 3.再次检查变量是否已经被初始化，如果还没被初始化就初始化一个对象。
 */
public class Singleton4 {
    // 私有构造器，防止外部new实例
    private Singleton4() {
    }

    private static Singleton4 instance;

    // 对外提供静态方法获取该对象
    public static Singleton4 getInstance() {
        // 第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if (instance == null) {
            synchronized (Singleton4.class) {
                // 抢到锁之后再次判断是否为null
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void show() {
        System.out.println("你好，我是懒汉式单例模式 -- 双重检查锁！");
    }

}
