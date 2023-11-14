package com.lyy.designpatterndemo.IteratorPattern.ip;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合角色
 * 实现抽象聚合类，返回一个具体迭代器的实例
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    // 获取迭代器对象
    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
