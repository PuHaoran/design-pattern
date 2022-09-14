package com.walle.guide.single;

/**
 * 静态内部类
 * 利用JVM内部机制实现实例创建时的唯一、线程安全、延迟加载。
 */
public class SinglePattern03 {
    private SinglePattern03() {

    }

    private static class SingleContainer{
        private static SinglePattern03 instance = new SinglePattern03();
    }

    public static SinglePattern03 getInstance() {
        return SinglePattern03.getInstance();
    }
}
