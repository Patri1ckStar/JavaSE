package com.neuedu.oop;

public class HungrySingleExample {
    private HungrySingleExample() {
    }

    ;
    private static HungrySingleExample hungrySingleExample = new HungrySingleExample();

    public static HungrySingleExample getInstance() {
        return hungrySingleExample;
    }
}
