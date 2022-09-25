package com.walle.guide.prototype;

/**
 * 实现一个可克隆对象，需要重写其中的clone方法和实现Cloneable接口。
 * 深克隆是属性为对象的类也要实现Cloneable接口和重写clone方法，浅克隆不需要。
 * @author 123
 * @create 2022/9/25 10:52
 */
public class Garden implements Cloneable{
    int width = 10;
    int height = 8;
    public Location loc = new Location("北京");

    public Garden(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "width=" + width +
                ", height=" + height +
                ", loc=" + loc +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Garden g = (Garden) super.clone();
        g.loc = (Location) loc.clone();
        return g;
     }
}
