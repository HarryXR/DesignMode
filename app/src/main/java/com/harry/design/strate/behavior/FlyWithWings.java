/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.strate.behavior;

import com.harry.design.strate.behavior.FlyBehavior;

/**
 * 实现 翅膀飞fly
 *
 * @author Harry
 * @date 2017/2/7.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("I`m flying");
    }
}
