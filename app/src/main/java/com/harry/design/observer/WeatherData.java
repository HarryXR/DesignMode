/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.observer;

import java.util.ArrayList;

/**
 * 类/接口描述
 *
 * @author Harry
 * @date 2017/2/8.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> mObservers;
    float temp;
    float humidity;
    float pressure;

    public WeatherData() {
        mObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        mObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : mObservers) {
            o.update(temp, humidity, pressure);
        }
    }

    public void measureChanged() {
        notifyObservers();
    }

    public void setMeasurements(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
