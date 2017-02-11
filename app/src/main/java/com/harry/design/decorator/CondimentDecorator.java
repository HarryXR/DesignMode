/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.decorator;

/**
 * 调料 可以取代Beverage
 * 装饰者
 *
 * @author Harry
 * @date 2017/2/11.
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
