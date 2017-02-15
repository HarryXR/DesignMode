/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.adapter;

/**
 * 类/接口描述
 *
 * @author Harry
 * @date 2017/2/15.
 */
public class AdapterTest {
    /**
     * 适配器
     * 将一个类的接口，转换成客户期望的另一个接口
     * 适配器让原本接口不兼容的类可以合作无间
     */
    public void test(){
        BlackDuck duck=new BlackDuck();

        Turkey turkey=new WildTurkey();
        TurkeyAdapter adapter=new TurkeyAdapter(turkey);

        testDuck(duck);

        testDuck(adapter);
    }
    
    private void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
