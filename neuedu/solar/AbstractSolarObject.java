package com.neuedu.solar;

import java.awt.*;

public abstract class AbstractSolarObject implements IMoveable, IDrawable {
    /**
     * 横坐标
     */
    public int x;
    /**
     * 纵坐标
     */
    public int y;
    public Image img;
    public int width;
    public int height;
    public AbstractSolarObject center;


    @Override
    public void move() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(img, x, y, null);
    }
}

