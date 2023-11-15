package com.lyy.designpatterndemo.VisitorPattern.vp;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类
 * 一个具有容器性质或者复合对象特性的类，它会含有一组元素（Element），并且可以迭代这些元素，供访问者访问
 */
public class Home {

    // 声明一个集合对象，用来存储元素对象
    private List<Animal> nodeList = new ArrayList<>();

    // 添加元素功能
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    public void action(Person person) {
        // 遍历集合元素，获取每一个元素，让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
