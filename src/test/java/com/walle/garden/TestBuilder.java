package com.walle.garden;

import com.walle.guide.buillder.Garden;

/**
 * @author 123
 * @create 2022/9/18 17:54
 */
public class TestBuilder {
    public static void main(String[] args) {
        Garden garden = new Garden.GardenBuilder()
                .basicInfo("设计模式花园", 100, 80)
                .loc("北京")
                .build();
        System.out.println(garden);
    }
}
