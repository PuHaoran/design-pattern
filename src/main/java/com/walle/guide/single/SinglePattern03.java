package com.walle.guide.single;

/**
 * 内部类
 * JAM内部机制能够保证一个类被加载时，这个类的加载过程是线程互斥的。
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
