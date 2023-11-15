package com.lyy.designpatterndemo.CompositePattern.cp;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院类
 */
public class College extends OrganizationComponent {
    // List中存放的 Department
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    /**
     * 重写add
     *
     * @param organizationComponent
     */
    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }


    /**
     * 重写remove
     *
     * @param organizationComponent
     */
    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("--------------" + getName() + getDes() + "--------------");
        // 遍历
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}

