package com.harry.design.commbine

import java.util.*

/**
 * 类/接口描述

 * @author Harry
 * *
 * @date 2017/5/22.
 */

class Menu(private val name: String, private val desc: String) : MenuComponent() {
    internal var components = ArrayList<MenuComponent>()

    override fun add(menuComponent: MenuComponent) {
        components.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        components.remove(menuComponent)
    }

    override fun getName(): String {
        return name
    }

    override fun getDesc(): String {
        return desc
    }

    override fun print() {
        val iterator = components.iterator()
        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            System.err.print(menuComponent.getName() + "/" + menuComponent.getDesc())
        }
    }
}
