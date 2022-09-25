package com.walle.garden;

import com.walle.guide.memento.ControlSurface;
import com.walle.guide.memento.Game;

/**
 * @author 123
 * @create 2022/9/25 16:30
 */
public class TestMemento {
    public static void main(String[] args) {
        ControlSurface controlSurface = new ControlSurface();
        Game game = new Game();
        // 保存关卡到控制面板
        game.setState("Level #1");
        controlSurface.add(game.saveStateToLevel());
        game.setState("Level #2");
        controlSurface.add(game.saveStateToLevel());

        // 恢复关卡
        game.getStateFromLevel(controlSurface.get(0));
        System.out.println("current game: " + game.getState());
        game.getStateFromLevel(controlSurface.get(1));
        System.out.println("current game: " + game.getState());
    }
}
