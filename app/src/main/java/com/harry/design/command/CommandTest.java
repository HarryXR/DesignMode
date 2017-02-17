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
public class CommandTest {
    public void test() {
        Light light = new Light();
        Command command = new LightOnComand(light);//封装电灯对象，带on开灯命令
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setCommand(command);
        control.press();
    }
}
