/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.decorator;

/**
 * 摩卡，可以搭配任何咖啡
 * 比如 摩卡深蓓咖啡 Mocha装饰DarkRoast
 * @author Harry
 * @date 2017/2/11.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }
}
