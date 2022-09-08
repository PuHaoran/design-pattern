package com.walle.guide;

import com.walle.guide.strategy.Context;
import com.walle.guide.strategy.OperationAdd;
import com.walle.guide.strategy.OperationSubtract;

public class TestStrategy {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.run(1, 2));

        Context context2 = new Context(new OperationSubtract());
        System.out.println(context2.run(1, 2));
    }

}
