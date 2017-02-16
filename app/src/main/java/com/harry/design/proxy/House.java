/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.proxy;

import android.os.SystemClock;

import java.text.SimpleDateFormat;

/**
 * 房屋实体
 *
 * @author Harry
 * @date 2017/2/16.
 */
public class House implements IHouse {

    private String name;//房屋名字
    private String price;//租金

    public House(String name,String price){
        this.name=name;
        this.price=price;
    }
    @Override
    public void getHouseInfo() {
System.out.print("House Info- name:" + name + "  ￥:" + price);
    }

    @Override
    public void signContract() {
        System.out.print("Contract:" + name + "  signed at" +
            new SimpleDateFormat("HH:mm:ss").format(SystemClock.uptimeMillis()));
    }

    @Override
    public void payFees() {
        System.out.print("Bill: name-" + name + "  $-" + price );
    }
}
