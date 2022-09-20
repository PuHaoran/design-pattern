package com.walle.guide.decorator;

/**
 * @author 123
 * @create 2022/9/20 22:39
 */
public abstract class GardenDecorator {
    protected SmallGarden decoratedGarden;

    public GardenDecorator(SmallGarden decoratedGarden) {
        this.decoratedGarden = decoratedGarden;
    }

    public void say() {
        decoratedGarden.say();
    }
}
