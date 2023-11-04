package com.lyy.designpatterndemo.CompositePattern.cp;

import lombok.Data;

/**
 * 顶级抽象类 -- 组织计狗
 */

@Data
public abstract class OrganizationComponent {

    private String name;
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    // 抽象方法,需要子类实现
    public abstract void print();
}
