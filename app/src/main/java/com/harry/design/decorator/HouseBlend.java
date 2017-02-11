/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.decorator;

/**
 * 一种咖啡
 *
 * @author Harry
 * @date 2017/2/11.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description="HouseBlend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
