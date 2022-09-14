package com.walle.guide.single;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private FileWriter fw;
    private Logger(){
        File f = new File("log.txt");
        try {
            fw = new FileWriter(f, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static final Logger INSTANCE = new Logger();

    public static Logger getInstance(){
        return INSTANCE;
    }

    public void log(String msg) {
        try {
            fw.write(msg);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
