package com.walle.garden;

import com.walle.guide.single.Todo;

public class TestSingle {
    public static void main(String[] args) {
        Todo todo = Todo.getInstance();
        todo.log("做菜");
        todo.log("吃饭");
    }
}
