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
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
