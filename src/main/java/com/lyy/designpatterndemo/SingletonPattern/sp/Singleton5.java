package com.lyy.designpatterndemo.SingletonPattern.sp;

/**
 * 懒汉式单例模式 -- volatile
 * 双重检查锁模式其实是存在问题，在多线程的情况下，可能会出现空指针问题，
 * 出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作。
 * 要解决双重检查锁模式带来空指针异常的问题，只需要使用 `volatile` 关键字, `volatile` 关键字可以保证可见性和有序性。
 */
public class Singleton5 {
    // 私有构造器，防止外部new实例
    private Singleton5() {
    }

    // 加volatile，防止指令重排序
    private static volatile Singleton5 instance = null;

    public static Singleton5 getInstance() {
        //第一次检查，过滤掉读操作，如果是读操作直接返回即可，不需加锁(第一次检查提高了读操作的性能)
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    // 第二次检查，进来的都是写操作，但同一时刻可能有多个写操作进来(线程并发安全问题)，所以需要加锁
                    // 而并发进来的线程由于锁会等待前一个线程构建好单例，其他线程判断单例不为空后直接返回
                    /**
                     * 对象new的过程对应的JVM字节码核心有以下几步
                     *
                     * 1、给instance分配内存空间
                     * 2、调用instance的构造器
                     * 3、将instance对象指向分配的内存空间
                     *
                     * 但是JVM为了优化指令，提高程序运行效率，允许指令重排序，所以上面的命令真正执行时可能下面的这种
                     *
                     * 1、给instance分配内存空间
                     * 2、将instance对象指向分配的内存空间 （如果线程A刚好执行完这个准备执行3）
                     * 3、调用instance的构造器
                     *
                     * 并发下，线程B最外层判断，因为instance已经指向了一块内存区域所以不为null，直接返回了
                     * 但是线程B拿到的是没有初始化的instance对象，使用未初始化的对象必然会报错的！
                     * synchronized保证了线程的原子性但无法保证指令的原子性，所以需要在instance上使用volatile来禁止指令重排
                     */
                    instance = new Singleton5();
                }
                return instance;
            }
        }
        return instance;
    }

    public void show() {
        System.out.println("你好，我是懒汉式单例模式 -- volatile！");
    }

}
