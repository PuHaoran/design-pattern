package com.walle.garden;

import com.walle.guide.decorator.SmallGarden;
import com.walle.guide.decorator.GardenDecorator;
import com.walle.guide.decorator.WallGardenDecorator;

/**
 * @author 123
 * @create 2022/9/20 22:48
 */
public class TestDecorator {
    public static void main(String[] args) {
        SmallGarden garden = new SmallGarden();
        garden.say();
        System.out.println("============");
        // 增加一个围墙
        GardenDecorator wallGarden = new WallGardenDecorator(garden);
        wallGarden.say();
    }
}
