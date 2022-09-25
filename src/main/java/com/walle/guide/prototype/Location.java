package com.walle.guide.prototype;

/**
 * @author 123
 * @create 2022/9/25 11:21
 */
public class Location implements Cloneable {
    String loc;

    public Location(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Location{" +
                "loc='" + loc + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
