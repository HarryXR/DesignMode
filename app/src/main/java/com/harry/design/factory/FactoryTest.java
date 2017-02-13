/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.factory;

/**
 * 类/接口描述
 *
 * @author Harry
 * @date 2017/2/13.
 */
public class FactoryTest {

    /**
     * 工厂方法模式
     * 定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个
     * 工厂方法让类的实例化推迟到子类
     */
    public void test(){
        PizzaStore nyStore=new NYPizzaStore();
        PizzaStore chicagoStore=new ChicagoPizzaStore();

        Pizza pizza=nyStore.createPizza("cheese");
        pizza.prepare();

        pizza=chicagoStore.createPizza("veggie");
        pizza.prepare();
    }
}
