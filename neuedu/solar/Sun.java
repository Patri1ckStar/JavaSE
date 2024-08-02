package com.neuedu.solar;

public class Sun extends AbstractSolarObject {


    /**
     * 构造方法
     */
    public Sun() {

    }

    /**
     * 构造方法
     */
    public Sun(String key) {
        this.img = ImageUtil.imgMap.get(key);
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
//        this.x = Constant.WINDOW_WIDTH / 2 - this.width / 2;
        this.x = Constant.WINDOW_WIDTH / 2 - img.getWidth(null) / 2;
        this.y = Constant.WINDOW_HEIGHT / 2 - img.getHeight(null) / 2;
    }

    /**
     * 构造方法
     */
    public Sun(int x, int y, String imgName) {
        this(imgName);
        this.x = x;
        this.y = y;
    }


}
