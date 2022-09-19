package com.walle.garden;

import com.walle.guide.command.InsertCommand;

/**
 * @author 123
 * @create 2022/9/19 22:48
 */
public class TestCommand {
    public static void main(String[] args) {
        InsertCommand insertCommand = new InsertCommand("1 + 1 = ");
        System.out.println(insertCommand.content);
        insertCommand.doit();
        System.out.println(insertCommand.content);
        insertCommand.undo();
        System.out.println(insertCommand.content);
    }
}
