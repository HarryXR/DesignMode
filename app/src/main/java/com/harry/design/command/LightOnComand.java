/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.command;

/**
 * 类/接口描述
 *
 * @author Harry
 * @date 2017/2/17.
 */
public class LightOnComand implements Command {

    Light light;

    public LightOnComand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
