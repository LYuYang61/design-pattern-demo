package com.lyy.designpatterndemo.SingletonPattern.sp;

/**
 * 懒汉式单例模式 -- Synchronize
 * 该方式也实现了懒加载效果，同时又解决了线程安全问题。
 * 但是在加了getInstance() 方法上添synchronized 关键字，导致该方法的执行效果特别低。
 * 与此同时，这一方法并不是一定确保了线程安全，在初始化instance的时候依旧可能会出现线程安全问题，一旦初始化完成就不存在了
 */
public class Singleton3 {
    // 私有构造器，防止外部new实例
    private Singleton3() {
    }

    // 在成员位置创建该类的对象
    private static Singleton3 instance;

    // 对外提供静态方法获取该对象
    public static synchronized Singleton3 getInstance() {
        // 判断是否已经实例化
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    public void show() {
        System.out.println("你好，我是懒汉式单例模式 -- Synchronize！");
    }

}
