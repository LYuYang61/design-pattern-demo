package com.lyy.designpatterndemo.IteratorPattern.ip;

import org.springframework.aop.target.LazyInitTargetSource;

import java.util.List;

/**
 * 具体迭代器角色类
 * 实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置
 */
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;
    private int position = 0;   // 用来记录遍历的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        // 从集合中获取指定位置的元素
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
