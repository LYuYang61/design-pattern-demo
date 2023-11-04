package com.lyy.designpatterndemo.CompositePattern.cp;

import java.util.ArrayList;
import java.util.List;

/**
 * 专业类
 */
public class Department extends OrganizationComponent {

    // List中存放的 Department
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public Department(String name, String des) {
        super(name, des);
    }

    /**
     * 重写add
     * @param organizationComponent
     */
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    /**
     * 重写remove
     * @param organizationComponent
     */
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println(getName() + "----->" + getDes());
    }
}
