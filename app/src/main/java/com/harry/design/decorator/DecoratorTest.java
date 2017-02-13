/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.decorator;

/**
 * 装设者模式 测试类
 *
 * @author Harry
 * @date 2017/2/11.
 */
public class DecoratorTest {
    /**
     * 装饰者模式
     * 动态的将责任附加到对象上，
     * 若要扩展功能，装饰者提供了比继承更有弹性的替代方案
     */
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
