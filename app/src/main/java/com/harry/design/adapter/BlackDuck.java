/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.adapter;

/**
 * 黑头鸭
 *
 * @author Harry
 * @date 2017/2/15.
 */
public class BlackDuck implements Duck {
    @Override
    public void quack() {
        System.out.print("black quack");
    }

    @Override
    public void fly() {
        System.out.print("black is flaying");
    }
}
