/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.command;

/**
 * 遥控器
 * 执行命令开灯，无需知道具体什么电灯对象，实现遥控器与电灯的解耦合
 *
 * @author Harry
 * @date 2017/2/17.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    /**
     * 模拟遥控器
     * 按下按钮，执行命令
     */
    public void press() {
        slot.execute();
    }
}
