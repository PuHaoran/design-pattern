package com.walle.guide.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 123
 * @create 2022/9/25 16:06
 */
public class ControlSurface {
    private List<Level> levelList = new ArrayList<>();

    public void add(Level level) {
        levelList.add(level);
    }

    public Level get(int index) {
        return levelList.get(index);
    }
}
