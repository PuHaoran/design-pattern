package com.walle.guide;

import com.walle.guide.single.SinglePattern01;
import com.walle.guide.single.SinglePattern02;

public class TestSingle {
    public static void main(String[] args) {
        SinglePattern01 singlePattern01 = SinglePattern01.getInstance();
        SinglePattern01 singlePattern02 = SinglePattern01.getInstance();
        System.out.println(singlePattern01 == singlePattern02);

        // 是否线程安全
        for (int i = 0; i < 100; i++) {
            new Thread(()-> {
                System.out.println(SinglePattern02.getInstance().hashCode());
            }).start();
        }
    }
}
