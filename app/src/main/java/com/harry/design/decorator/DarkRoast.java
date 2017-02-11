/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.decorator;

/**
 * 深蓓咖啡
 *
 * @author Harry
 * @date 2017/2/11.
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description="DarkRoast";
    }
    @Override
    public double cost() {
        return .99;
    }
}
