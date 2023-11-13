package com.lyy.designpatterndemo.MediatorPattern;

import com.lyy.designpatterndemo.MediatorPattern.mp.HouseOwner;
import com.lyy.designpatterndemo.MediatorPattern.mp.MediatorStructure;
import com.lyy.designpatterndemo.MediatorPattern.mp.Tenant;

public class MediatorTest {
    public static void main(String[] args) {
        // 一个房主、一个租房者、一个中介机构
        MediatorStructure mediator = new MediatorStructure();

        // 房主和租房者只需要知道中介机构即可
        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        // 中介结构要知道房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("我要租三室的房子！！！");
        houseOwner.constact("我这里有三室的房子，你要租吗？");
    }
}
