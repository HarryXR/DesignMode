package com.harry.design.commbine

/**
 * 类/接口描述

 * @author Harry
 * *
 * @date 2017/5/22.
 */

class MenuItem(private val name:  String, private val desc: String) : MenuComponent() {

    override fun getName(): String {
        return name
    }

    override fun getDesc(): String {
        return desc
    }

    override fun print() {
        System.err.print(getName() + "/" + getDesc())
    }

}
