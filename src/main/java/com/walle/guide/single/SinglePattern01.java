package com.walle.guide.single;

/**
 * 饿汉模式
 * 类加载时实例化单例对象，没有加锁，执行效率高，线程安全。
 * @author a58
 */
public class SinglePattern01 {
    private SinglePattern01() {

    }
    private static final SinglePattern01 INSTANCE = new SinglePattern01();

    public static SinglePattern01 getInstance() {
        return INSTANCE;
    }
}
