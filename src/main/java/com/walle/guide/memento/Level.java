package com.walle.guide.memento;

/**
 * 关卡类，无法直接保存游戏关卡，必须借助控制
 * @author 123
 * @create 2022/9/25 16:03
 */
public class Level {
    String state;

    public Level(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
