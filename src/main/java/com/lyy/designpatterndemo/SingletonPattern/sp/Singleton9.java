package com.lyy.designpatterndemo.SingletonPattern.sp;

import java.lang.reflect.Constructor;

/**
 * 单例破环 -- 反射
 */
public class Singleton9 {
    public static void main(String[] args) throws Exception {
        // 获取Singleton类的字节码对象
        Class clazz = Singleton9.class;
        // 获取Singleton类的私有无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();
        // 取消访问检查
        constructor.setAccessible(true);
        // 创建Singleton类的对象s1
        Singleton9 s1 = (Singleton9) constructor.newInstance();
        // 创建Singleton类的对象s2
        Singleton9 s2 = (Singleton9) constructor.newInstance();
        // 判断通过反射创建的两个Singleton对象是否是同一个对象
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}

