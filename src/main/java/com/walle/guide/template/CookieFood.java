package com.walle.guide.template;

/**
 * 定义一个抽象类，模板方法设置为final
 * @author 123
 * @create 2022/9/18 16:39
 */
public abstract class  CookieFood {
    abstract void buyVegetables();
    abstract void washVegetables();

    /**
     * 模板
     */
    public void cookie() {
        buyVegetables();
        washVegetables();
    }
}
