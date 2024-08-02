package com.neuedu.solar;

import java.awt.*;

public class Background extends AbstractSolarObject {

    public Background() {
        this.x = 0;
        this.y = 0;
    }

    public Background(String key) {
        this();
        this.img = ImageUtil.imgMap.get(key);
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
    }


}
