package com.lyy.designpatterndemo.SingletonPattern.sp;

/**
 * 懒汉式单例模式 -- 静态内部类
 * 静态内部类只会加载一次，而静态方法虽然只会被加载一次，但有可能会被调用多次，所以静态内部类不存在线程安全问题，而静态方法存在
 * 而且jvm在初始化的时候只会加载外部类，内部类是要等待调用时才加载，并且加载内部类时会保证jvm指令的执行顺序，不会产生空指针问题
 */
public class Singleton6 {

    // 私有构造器，防止外部new实例
    private Singleton6() {

    }

    private static class SingletonHolder {
        private static final Singleton6 singleton = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return SingletonHolder.singleton;
    }

    public void show() {
        System.out.println("你好，我是懒汉式单例模式 -- 静态内部类！");
    }

}

