package com.neuedu.solar;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SolarSystemClient extends MyFrame {

    Background bg = new Background("bg");

    static Sun sun = new Sun("sun");

    Planet mercury = new Planet(sun, "1", "水星", 0.387, 0.2056, 88, "mercury");
    Planet venus = new Planet(sun, "2", "金星", 0.72, 0.0068, 225, "venus");
    Planet earth = new Planet(sun, "3", "地球", 1, 0.0167, 365, "earth");

    Planet moon = new Planet(earth, "100", "月球", 0.3, 0, 365 / 12, "moon", true);

    Planet mars = new Planet(sun, "4", "火星", 1.52, 0.0934, 687, "mars");

    static List<Planet> smallPlanets = new ArrayList<>();

    static {
        for (int i = 0; i < 10_000; i++) {
            double au = Math.random() * 3 + 2;
            int t = (int) (Math.random() * 3300 + 700);
            Planet smallPlanet = new Planet(sun, "", "小行星",
                    au, 0, t, "smallPlanet", true);
            smallPlanets.add(smallPlanet);
        }
    }


    Planet jupiter = new Planet(sun, "5", "木星", 5.2, 0.0489, 4330, "jupiter");
    Planet saturn = new Planet(sun, "6", "土星", 9.54, 0.0557, 10832, "saturn");
    Planet uranus = new Planet(sun, "7", "天王星", 19.218, 0.0444, 30777, "uranus");
    Planet neptune = new Planet(sun, "3", "海王星", 30.06, 0.0112, 60328, "neptune");


    @Override
    public void paint(Graphics g) {
        bg.draw(g);
        sun.draw(g);
        mercury.draw(g);
        venus.draw(g);
        earth.draw(g);
        moon.draw(g);
        mars.draw(g);

        for (Planet smallPlanet : smallPlanets) {
            smallPlanet.draw(g);
        }

        jupiter.draw(g);
        saturn.draw(g);
        uranus.draw(g);
        neptune.draw(g);
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN,30);
        g.setFont(font);
        g.setColor(Color.WHITE);
        g.drawString("李玮",300,300);
    }

    public static void main(String[] args) {
        new SolarSystemClient().loadFrame();
    }
}
