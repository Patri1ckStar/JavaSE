package com.neuedu.oop;

public class LazySingleExample {
    private LazySingleExample() {
    }

    ;
    private static LazySingleExample lazySingleExample;

    public static LazySingleExample getInstance() {
        if (lazySingleExample == null) {
            lazySingleExample = new LazySingleExample();
        }
        return lazySingleExample;
    }
}
