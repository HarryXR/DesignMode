/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.strate.bean;

import com.harry.design.strate.behavior.FlyWithWings;
import com.harry.design.strate.behavior.Quack;

/**
 * 绿头鸭 会呱呱叫 会用翅膀飞
 *
 * @author Harry
 * @date 2017/2/7.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
