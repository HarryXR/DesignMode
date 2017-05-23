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

    /**
     * 命令模式
     * 将“请求”封装成对象，以便使用不同的请求、队列、或者日志来参数化其他对象。
     * 也支持可撤销的动作
     */
    public void test() {
        Light light = new Light();
        Command command = new LightOnComand(light);//封装电灯对象，带on开灯命令
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setCommand(command);
        control.press();
    }
}
