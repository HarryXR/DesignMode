/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.strate.bean;

import com.harry.design.strate.behavior.FlyBehavior;
import com.harry.design.strate.behavior.QuackBehavior;

/**
 * 鸭子 超类
 *
 * @author Harry
 * @date 2017/2/7.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /*
    执行fly行为
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /*
    执行quack行为
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior behavior) {
        this.flyBehavior = behavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
