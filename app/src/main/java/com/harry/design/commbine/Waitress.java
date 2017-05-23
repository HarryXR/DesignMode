package com.harry.design.commbine;

/**
 * 类/接口描述
 *
 * @author Harry
 * @date 2017/5/22.
 */

public class Waitress {
    MenuComponent allMenus;
    public Waitress(MenuComponent menus){
        allMenus=menus;
    }
    public void printMenu(){
        allMenus.print();
    }
}
