package com.walle.guide.single;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Todo {
    private FileWriter fw;
    private Todo(){
        File f = new File("./todolist.txt");
        try {
            fw = new FileWriter(f, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static final Todo INSTANCE = new Todo();

    public static Todo getInstance(){
        return INSTANCE;
    }

    public void log(String msg) {
        try {
            fw.write(msg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
