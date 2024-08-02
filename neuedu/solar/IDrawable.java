package com.neuedu.solar;

import java.awt.*;

/**
 * 太阳系中的所有物体都必须绘制到界面上
 */
public interface IDrawable {
    /**
     * 绘制的方法
     */
    public abstract void draw(Graphics g);
}
