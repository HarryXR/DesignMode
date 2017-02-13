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
public class CheesePizza extends Pizza {
    @Override
    protected void prepare() {
        super.prepare();
        System.out.print("I`m veggie CheesePizza");
    }
}
