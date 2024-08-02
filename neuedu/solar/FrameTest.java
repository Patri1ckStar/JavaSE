package com.neuedu.solar;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class FrameTest extends Frame {


    Image sun = ImageUtil.getImage("SUN.png");
    int width = sun.getWidth(null);
    int height = sun.getHeight(null);
    Image earth = ImageUtil.getImage("Earth.png");
    Image bg = ImageUtil.getImage("background.jpg");


    @Override
    public void paint(Graphics g) {

        g.drawImage(bg, 0, 0, null);
        g.drawImage(sun, Constant.WINDOW_WIDTH / 2 - this.width / 2,
                Constant.WINDOW_HEIGHT / 2 - this.height / 2, null);
        g.drawImage(earth, 500, 300, null);
    }

}










