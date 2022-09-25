package com.walle.garden;

import com.walle.guide.prototype.Garden;
import com.walle.guide.prototype.Location;

/**
 * @author 123
 * @create 2022/9/25 11:16
 */
public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Garden garden1 = new Garden(10, 8);
        Garden garden2 = (Garden)garden1.clone();
        System.out.println(garden1);
        System.out.println(garden2);
        System.out.println(garden1 == garden2);
        System.out.println(garden1.loc == garden2.loc);
        garden1.loc = new Location("天津");
        System.out.println(garden1.loc);
        System.out.println(garden2.loc);
    }
}
