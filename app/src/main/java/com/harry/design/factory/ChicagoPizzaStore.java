/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.factory;

/**
 * 芝加哥风味披萨
 *
 * @author Harry
 * @date 2017/2/13.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        }
        else if ("veggie".equals(type)) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
