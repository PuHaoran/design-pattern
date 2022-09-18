package com.walle.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 123
 * @create 2022/9/17 21:14
 */
public class TankFrame01 extends Frame{

    int x = 200, y = 200;
    public TankFrame01() {
        setSize(800, 600);
        setTitle("坦克大战");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        g.fillRect(x, y, 50, 50);
        x += 10;
        y += 10;
        // g.fillRect(x, y, 50, 50);
    }
}
