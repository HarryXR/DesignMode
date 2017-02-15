/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.adapter;

/**
 * 火鸡适配器
 * 用火鸡对象冒充鸭子对象
 *
 * @author Harry
 * @date 2017/2/15.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
