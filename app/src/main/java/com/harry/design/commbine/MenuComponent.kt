package com.harry.design.commbine

/**
 * 菜单接口
 * @author Harry
 * @date 2017/5/22.
 */
abstract open class MenuComponent {
    open fun add(menuComponent: MenuComponent): Unit {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent): Unit {
        throw UnsupportedOperationException()
    }

    open fun getName(): String {
        throw UnsupportedOperationException()
    }

    open fun getDesc(): String {
        throw UnsupportedOperationException()
    }

    open fun print(): Unit {
        throw UnsupportedOperationException()
    }
}