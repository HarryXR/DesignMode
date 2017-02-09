/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.observer;

/**
 * 状态显示板，可以有多个类似显示板
 *
 * @author Harry
 * @date 2017/2/8.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject data) {
        weatherData = data;
    }

    @Override
    public void display() {
        System.out.print("temp="+temp+",humidity"+humidity+",pressure="+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
