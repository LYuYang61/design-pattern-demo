package com.lyy.designpatterndemo.SingletonPattern.sp;

import java.io.*;

/**
 * 单例破坏 -- 序列化和反序列化
 * 序列化前的对象和反序列化后得到的对象内存地址不同，会破坏单例
 */
public class Singleton8 implements Serializable{

    // 私有构造方法
    private Singleton8() {
    }

    private static class SingletonHolder {
        private static final Singleton8 INSTANCE = new Singleton8();
    }

    // 对外提供静态方法获取该对象
    public static Singleton8 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 测试
     */
    public static void main(String[] args) throws Exception {
        // 往文件中写对象
        writeObject2File();
        // 从文件中读取对象
        Singleton8 s1 = readObjectFromFile();
        Singleton8 s2 = readObjectFromFile();
        // 判断两个反序列化后的对象是否是同一个对象
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }

    /**
     * 从文件中反序列化成对象
     */
    private static Singleton8 readObjectFromFile() throws Exception {
        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new
                FileInputStream("src\\main\\java\\com\\lyy\\designpatterndemo\\SingletonPattern\\sp\\sp.txt"));
        // 第一个读取Singleton对象
        Singleton8 instance = (Singleton8) ois.readObject();
        return instance;
    }

    /**
     * 序列化到文件
     */
    public static void writeObject2File() throws Exception {
        // 获取Singleton类的对象
        Singleton8 instance = Singleton8.getInstance();
        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new
                FileOutputStream("src\\main\\java\\com\\lyy\\designpatterndemo\\SingletonPattern\\sp\\sp.txt"));
        // 将instance对象写出到文件中
        oos.writeObject(instance);
    }
}

