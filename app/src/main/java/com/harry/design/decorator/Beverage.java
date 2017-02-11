/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.decorator;

/**
 * 饮料 超类
 *
 * @author Harry
 * @date 2017/2/11.
 */
public abstract class Beverage {

    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
