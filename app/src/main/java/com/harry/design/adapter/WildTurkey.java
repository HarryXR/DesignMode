/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.adapter;

/**
 * 火鸡实现类
 *
 * @author Harry
 * @date 2017/2/15.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.print("I can gobble");
    }

    @Override
    public void fly() {
        System.out.print("I can fly a short distance");
    }
}
