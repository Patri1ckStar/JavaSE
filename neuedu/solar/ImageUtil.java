package com.neuedu.solar;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * 处理图片或其他静态资源
 */
public final class ImageUtil {

    public static Map<String, Image> imgMap = new HashMap<>();

    static {

        imgMap.put("bg", ImageUtil.getImage("background.jpg"));
        imgMap.put("smallPlanet", ImageUtil.getImage("smallPlanet.png"));
        imgMap.put("sun", ImageUtil.getImage("SUN.png"));
        imgMap.put("mercury", ImageUtil.getImage("Mercury.png"));
        imgMap.put("venus", ImageUtil.getImage("Venus.png"));
        imgMap.put("earth", ImageUtil.getImage("Earth.png"));
        imgMap.put("moon", ImageUtil.getImage("moon.png"));
        imgMap.put("mars", ImageUtil.getImage("Mars.png"));
        imgMap.put("jupiter", ImageUtil.getImage("Jupiter.png"));
        imgMap.put("saturn", ImageUtil.getImage("Saturn.png"));
        imgMap.put("uranus", ImageUtil.getImage("Uranus.png"));
        imgMap.put("neptune", ImageUtil.getImage("Neptune.png"));
    }


    private ImageUtil() {
    }

    public static Image getImage(String imgName) {
        //使用BufferedImage
        BufferedImage img = null;
        URL url = ImageUtil.class.getClassLoader().getResource(Constant.IMG_PATH_PRE + imgName);
        try {
            img = ImageIO.read(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return img;
    }
}
