package com.walle.guide.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 123
 * @create 2022/10/2 17:23
 */
public class Child {
    private boolean cry = false;
    private List<Observer> observerList = new ArrayList<>();

    {
        observerList.add(new Dog());
        observerList.add(new Mom());
    }

    public void wakeup() {
        cry = true;

        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "garden", this);

        for (Observer o: observerList) {
            o.actionOnWakeUp(event);
        }
    }
}
