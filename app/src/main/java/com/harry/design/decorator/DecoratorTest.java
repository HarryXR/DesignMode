/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.decorator;

/**
 * 类/接口描述
 *
 * @author Harry
 * @date 2017/2/11.
 */
public class DecoratorTest {
    public void test() {
        //计算摩卡深蓓咖啡
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage.cost();//0.20+0.99
        //摩卡浓缩
        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2.cost();//0.20+1.99
    }
}
