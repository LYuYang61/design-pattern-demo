package com.lyy.designpatterndemo.MediatorPattern.mp;

/**
 * 具体中介者类
 * 实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色
 */
public class MediatorStructure extends Mediator {
    // 首先中介结构必须知道所有房主和租房者的信息
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public void constact(String message, Person person) {
        // 租房者获得信息
        if (person == tenant) {
            tenant.getMessage(message);
        } else {       // 房主获得信息
            houseOwner.getMessage(message);
        }
    }
}
