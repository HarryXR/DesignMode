/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.strate.behavior;

/**
 * 呱呱叫quack行为实现类
 *
 * @author Harry
 * @date 2017/2/7.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("Quack");
    }
}
