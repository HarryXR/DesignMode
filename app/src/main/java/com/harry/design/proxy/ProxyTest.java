/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.proxy;

/**
 * 代理测试
 *
 * @author Harry
 * @date 2017/2/16.
 */
public class ProxyTest {

    public void test() {
        IHouse house = new House("紫禁城", "1000");
        HouseProxy proxy = new HouseProxy(house);
        proxy.getHouseInfo();
        proxy.signContract();;
        proxy.payFees();

        //
    }
}
