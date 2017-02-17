/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.command;

/**
 * 灯 开关动作
 *
 * @author Harry
 * @date 2017/2/17.
 */
public class Light {
    public Light(){}

    public void on(){
        System.out.print("开灯");
    }

    public void off(){
        System.out.print("关灯");
    }
}
