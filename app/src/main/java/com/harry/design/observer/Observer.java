/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.observer;

/**
 * 类/接口描述
 *
 * @author Harry
 * @date 2017/2/8.
 */
public interface Observer {
    //显示温度湿度气压
    void update(float temp,float humidity,float pressure );
}
