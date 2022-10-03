package com.walle.guide.observer;

/**
 * @author 123
 * @create 2022/10/2 17:26
 */
public class Dog implements Observer{
    private void shut() {
        System.out.println("wang wang.");
    }
    @Override
    public void actionOnWakeUp() {
        shut();
    }
}
