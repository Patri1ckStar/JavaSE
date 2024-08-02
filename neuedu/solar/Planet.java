package com.neuedu.solar;

import java.awt.*;

public class Planet extends AbstractSolarObject {
    /**
     * 行星的序号
     */
    private String no;
    /**
     * 名字
     */
    private String name;
    /**
     * 椭圆轨迹的半长轴
     */
    private int longAxis;
    /**
     * 半短轴
     */
    private int shortAxis;

    private double theta;
    private boolean smallPlanet;
    /**
     * 单位时间内的速度
     */
    private double speed;

    /**
     * 构造方法
     */
    public Planet(AbstractSolarObject center, String no, String name, double au, double e, int t, String key) {
        this.center = center;
        this.img = ImageUtil.imgMap.get(key);
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);

        this.no = no;
        this.name = name;
        this.longAxis = getLongAxisByAu(au);
        this.shortAxis = getShortAxisbyE(e) / 2;
        this.theta = 0.0;
        this.speed = getSpeedByT(t);
        this.x = center.x + center.width / 2 - this.width / 2 + this.longAxis;
        this.y = center.y + center.height / 2 - this.height / 2;
    }

    ;


    public Planet(AbstractSolarObject center, String no, String name, double au, double e, int t, String key, boolean smallPlaner) {
        this(center, no, name, au, e, t, key);
        this.smallPlanet = smallPlaner;
    }

    ;

    @Override
    public void move() {
        x = (int) (this.longAxis * Math.cos(theta) + center.width / 2 + center.x - this.width / 2);
        y = (int) (this.shortAxis * Math.sin(theta) + center.y + center.height / 2 - this.height / 2);
        theta += this.speed;
    }

    @Override
    public void draw(Graphics g) {
        if (!smallPlanet) {
            drawTrace(g);
            g.setColor(Color.WHITE);
            g.drawString(this.no + "." + this.name,x,y);
        }
        super.draw(g);
        move();

    }

    private void drawTrace(Graphics g) {
        int x = center.x + center.width / 2 - longAxis;
        int y = center.y + center.height / 2 - shortAxis;
        int width = 2 * longAxis;
        int height = 2 * shortAxis;
        g.setColor(Color.WHITE);
        g.drawOval(x, y, width, height);
    }


//    public void run(){
//        while(true){
//            move();
//        }
//    }

    /**
     * @param au 行星距离太阳的天文单位
     * @return 半长轴
     */
    private int getLongAxisByAu(double au) {
        return (int) (au * Constant.RATE);
    }

    /**
     * @param e 行星轨迹的离心率
     * @return 半短轴
     */
    private int getShortAxisbyE(double e) {
        return (int) (this.longAxis * Math.sqrt(1 - Math.pow(e, 2)));
    }

    /**
     * @param t 行星的公转周期（地球日）
     * @return 单位时间线速度方向的该变量
     */
    private double getSpeedByT(int t) {
        return 365.0 / t * 0.02;
    }
}
