package com.walle.guide.command;

/**
 * @author 123
 * @create 2022/9/19 22:43
 */
public class InsertCommand extends Command {
    public String content;
    String ans = "2";
    public InsertCommand(String s) {
        this.content = s;
    }

    @Override
    public void doit() {
        content = content + ans;
    }

    @Override
    public void undo() {
        content = content.substring(0, content.length()-ans.length());
    }
}
