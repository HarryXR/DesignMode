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
     *
     */
    public void test(){
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay display=new CurrentConditionDisplay(weatherData);
        weatherData.registerObserver(display);
        weatherData.setMeasurements(20,40,90);
        weatherData.measureChanged();
    }
}
