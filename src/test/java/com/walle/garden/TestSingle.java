package com.walle.garden;

import com.walle.guide.single.Logger;

public class TestSingle {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("做菜");
        logger.log("吃饭");
    }
}
