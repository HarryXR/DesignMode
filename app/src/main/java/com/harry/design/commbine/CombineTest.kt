package com.harry.design.commbine

/**
 * 类/接口描述
 * @author Harry
 * @date 2017/5/23.
 */
class CombineTest {
    /**
     * 组合模式
     * 允许你将对象组成树形结构，来表现"整体/部分"的层次结构
     * 组合能让客户以一致的方式处理个别对象和对象组合
     */
    fun test(){
        var pancake:MenuComponent= Menu("pancake house menu","Breakfast")
        var dinerMenu:MenuComponent= Menu("diner menu","lunch")

        var allMenus:MenuComponent= Menu("all menus","all menus combined")

        allMenus.add(pancake)
        allMenus.add(dinerMenu)

        dinerMenu.add(MenuItem("Pasta","bread"))
        var waitress :Waitress = Waitress(allMenus)
        waitress.printMenu()
    }

}