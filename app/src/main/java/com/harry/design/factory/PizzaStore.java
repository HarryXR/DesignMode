/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.factory;

/**
 * 工厂超类
 * @author Harry
 * @date 2017/2/13.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
