/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.strate;

import com.harry.design.strate.bean.Duck;
import com.harry.design.strate.bean.MallardDuck;

/**
 * 策略模式测试类
 *
 * @author Harry
 * @date 2017/2/7.
 */
public class StrateTest {
    /**
     * 策略模式
     * 定义了算法族，分别封装起来，让它们之间互相替换
     * 该模式让算法的变化独立于使用算法的客户
     */
    public void test() {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
    }
}
