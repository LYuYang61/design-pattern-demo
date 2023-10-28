package com.lyy.designpatterndemo.SingletonPattern.sp;

/**
 * 懒汉式单例模式 -- 枚举
 */
public enum Singleton7 {
    INSTANCE;

    public void show() {
        System.out.println("你好，我是懒汉式单例模式 -- 枚举！");
    }

    public static void main(String[] args) {
        Singleton7.INSTANCE.show();
    }
}
