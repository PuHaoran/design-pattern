package com.walle.guide.single;

/**
 * 枚举单例
 */
public enum SinglePattern02 {
    INSTANCE;
    public static SinglePattern02 getInstance() {
        return INSTANCE;
    }
}
