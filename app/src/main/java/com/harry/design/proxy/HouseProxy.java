/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.proxy;

/**
 * 类/接口描述
 *
 * @author Harry
 * @date 2017/2/16.
 */
public class HouseProxy implements IHouse {
    public IHouse house;

    public HouseProxy(IHouse house) {
        this.house = house;
    }

    @Override
    public void getHouseInfo() {
        house.getHouseInfo();
    }

    @Override
    public void signContract() {
        house.signContract();
    }

    @Override
    public void payFees() {
        house.payFees();
    }
}
