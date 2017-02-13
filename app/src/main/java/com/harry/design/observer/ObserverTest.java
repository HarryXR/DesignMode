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
public class ObserverTest {
    /**
     * 观察者模式
     * 定义了对象之间的一对多依赖，这样一来，当一个对象状态改变时，它的所有依赖者都会受到通知并自动更新
     */
    public void test(){
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay display=new CurrentConditionDisplay(weatherData);
        weatherData.registerObserver(display);
        weatherData.setMeasurements(20,40,90);
        weatherData.measureChanged();
    }
}
