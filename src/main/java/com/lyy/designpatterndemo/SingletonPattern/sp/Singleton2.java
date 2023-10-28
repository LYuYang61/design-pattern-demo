package com.lyy.designpatterndemo.SingletonPattern.sp;

/**
 * 懒汉式单例模式 -- 线程不安全
 * 该方式在成员位置声明Singleton类型的静态变量，并没有进行对象的赋值操作，
 * 当调用getInstance() 方法获取Singleton类的对象的时候才创建Singleton类的对象，这样就实现了懒加载的效果。
 * 但是，如果是多线程环境，会出现线程安全问题
 */
public class Singleton2 {
    // 1. 私有构造器，防止外部new实例
    private Singleton2() {
    }

    // 2. 在成员位置创建该类的对象
    private static Singleton2 instance;

    // 3. 对外提供静态方法获取该对象
    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public void show() {
        System.out.println("你好，我是懒汉式单例模式 -- 线程不安全！");
    }


}
