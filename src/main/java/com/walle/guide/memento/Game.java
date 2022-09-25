package com.walle.guide.memento;

/**
 *
 * @author 123
 * @create 2022/9/25 16:04
 */
public class Game {
    private String state;

    public Level saveStateToLevel() {
        return new Level(state);
    }

    public void getStateFromLevel(Level level) {
        state = level.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
