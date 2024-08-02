package com.neuedu.solar;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    /**
     * 自定义一个生成窗口的方法
     */
    public void loadFrame(){
        //设置窗口位置
        this.setLocation(0,0);
        //设置窗口宽高
        this.setSize(Constant.WINDOW_WIDTH,Constant.WINDOW_HEIGHT);
        this.setLocationRelativeTo(null);
        //设置可访问性，默认值是false
        this.setVisible(true);
        //改变窗口大小
        this.setResizable(false);
        //匿名内部类
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //设置标题
        this.setTitle("群星闪耀时");
        //设置图标
        this.setIconImage(ImageUtil.getImage("Earth.png"));
        new MyThread().start();
    }


    class MyThread extends Thread{
        @Override
        public void run() {
            while(true){
                MyFrame.this.repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    Image backImg = null;

    //重写update()方法，在窗口里面添加一个虚拟的图片
    @Override
    public void update(Graphics g) {
        if(backImg == null){
            //如果虚拟图片不存在，创建一个窗口一样大的图片
            backImg = createImage(Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
        }


        //获取到虚拟图片的画笔
        Graphics backg = backImg.getGraphics();
        Color c = backg.getColor();
        backg.setColor(Color.GRAY);
        backg.fillRect(0,0,Constant.WINDOW_WIDTH,Constant.WINDOW_HEIGHT);
        backg.setColor(c);
        //调用虚拟图片的paint（）方法，每50ms刷新一次
        paint(backg);
        g.drawImage(backImg,0,0,null);
    }
}
