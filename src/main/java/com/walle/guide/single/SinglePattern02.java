package com.walle.guide.single;

/**
 * 枚举单例
 * JVM会保证枚举对象的唯一性，因此每一个枚举类型及其变量在JVM都是唯一的。
 */
public enum SinglePattern02 {
    INSTANCE;
    public static SinglePattern02 getInstance() {
        return INSTANCE;
    }
}
