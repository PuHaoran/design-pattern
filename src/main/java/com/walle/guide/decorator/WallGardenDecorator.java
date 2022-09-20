package com.walle.guide.decorator;

/**
 * @author 123
 * @create 2022/9/20 22:44
 */
public class WallGardenDecorator extends GardenDecorator{
    public WallGardenDecorator(SmallGarden decoratedGarden) {
        super(decoratedGarden);
    }

    @Override
    public void say() {
        super.say();
        buildWall();
    }

    private void buildWall() {
        System.out.println("border: wall");
    }
}
