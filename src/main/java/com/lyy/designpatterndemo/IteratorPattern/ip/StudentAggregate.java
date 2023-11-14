package com.lyy.designpatterndemo.IteratorPattern.ip;

/**
 * 抽象聚合角色接口
 * 定义存储、添加、删除聚合元素以及创建迭代器对象的接口
 */
public interface StudentAggregate {

    // 添加学生
    void addStudent(Student student);

    // 删除学生
    void removeStudent(Student student);

    // 获取迭代器对象功能
    StudentIterator getStudentIterator();
}
