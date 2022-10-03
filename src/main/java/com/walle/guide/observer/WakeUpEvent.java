package com.walle.guide.observer;

abstract class Event<T> {
    abstract T getSource();
}

public class WakeUpEvent extends Event{
    long ts;
    String loc;
    Child source;
    WakeUpEvent(long ts, String loc, Child source) {
        this.ts = ts;
        this.loc = loc;
        this.source = source;
    }

    @Override
    Object getSource() {
        return source;
    }
}
