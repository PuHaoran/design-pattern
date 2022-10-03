package com.walle.guide.observer;

/**
 * @author 123
 * @create 2022/10/2 17:25
 */
public class Mom implements Observer{
    private void feed() {
        System.out.println("mom feed baby.");
    }

    @Override
    public void actionOnWakeUp() {
        feed();
    }
}
