package com.walle.garden;

import com.walle.guide.bridge.BigGift;
import com.walle.guide.bridge.Gift;
import com.walle.guide.bridge.Toy;

/**
 * @author 123
 * @create 2022/9/21 23:18
 */
public class TestBridge {
    public static void main(String[] args) {
        Gift g = new BigGift(new Toy());
        System.out.println(g);
    }
}
