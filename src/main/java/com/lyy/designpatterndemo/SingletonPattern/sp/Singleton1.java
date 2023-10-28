package com.lyy.designpatterndemo.SingletonPattern.sp;

/**
 * 饿汉式单例模式
 * 该方式在成员位置声明Singleton类型的静态变量，并创建Singleton类的对象instance
 * instance对象是随着类的加载而创建的，如果该对象足够大的话，而一直没有使用就会造成内存的浪费
 */
public class Singleton1 {
    // 1. 私有构造器，防止外部new实例
    private Singleton1() {
    }

    // 2. 内部创建类的对象，并且需要设置成static，因为静态方法中只能调用static属性
    // 并且需要控制只有一个对象
    private static Singleton1 instance = new Singleton1();

    // 3. 由于构造器进行了私有化不能直接 new， 因此需要提供公共的静态的方法，返回类的对象
    public static Singleton1 getInstance() {
        return instance;
    }

    public void show() {
        System.out.println("你好，我是饿汉式单例模式！");
    }

}
