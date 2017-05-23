/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.harry.design.command;

/**
 * 命令对象 自带请求
 *
 * @author Harry
 * @date 2017/2/17.
 */
public interface Command {
    void execute();//执行命令
    void undo();//撤销命令
}
