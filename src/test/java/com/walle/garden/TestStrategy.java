package com.walle.garden;

import com.walle.guide.strategy.Context;
import com.walle.guide.strategy.OperationAdd;
import com.walle.guide.strategy.OperationSubtract;

public class TestStrategy {
    public static void main(String[] args) {
        // 加策略
        OperationAdd operationAdd = new OperationAdd();
        // 减策略
        OperationSubtract operationSubtract = new OperationSubtract();

        // Context构造方法中传入策略对象，以耦合代替继承
        Context context = new Context(operationAdd);
        System.out.println(context.run(1, 2));
    }
}
