package com.lyy.designpatterndemo.IteratorPattern.ip;

/**
 * 抽象迭代器角色接口
 * 定义访问和遍历聚合元素的接口，通常包含 hasNext()、next() 等方法
 */
public interface StudentIterator {

    // 判断是否还有元素
    boolean hasNext();

    // 获取下一个元素
    Student next();
}
