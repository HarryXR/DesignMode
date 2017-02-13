/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.single;

/**
 * 单例
 * 一个类只有一个实例
 *
 * @author Harry
 * @date 2017/2/11.
 */
public class SingleTon {

    private static SingleTon instance;

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        /*
        双重检查加锁
        只有第一次调用时才会 执行同步
         */
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
}
