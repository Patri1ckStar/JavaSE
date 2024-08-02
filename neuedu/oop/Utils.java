package com.neuedu.oop;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class Utils {

    /**
     * 创建又给私有的对象
     */
    private static Utils utils = new Utils();

    /**
     * 私有的空的构造方法
     */
    private Utils() {
    }

    /**
     * 提供一个方法用于外部访问对象
     *
     * @return
     */
    public static Utils getInstance() {
        return utils;
    }

    /**
     * 创建一个方法求累加和
     *
     * @param num 传入一个整数算累加和
     * @return 返回最终累加和的结果
     */
    public static int addition(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * 定义一个方法求阶乘
     *
     * @param num 输入一个整数求整数的阶乘
     * @return 返回阶乘的结果
     */
    public static int multiply(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }
        return sum;
    }

    /**
     * 定义一个方法用冒泡排序法将数组升序排列后输出
     *
     * @param array
     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
    }

    /**
     * 创建一个方法判断输入的数是否为偶数
     *
     * @param num 输入的数
     * @return 返回是否式偶数
     */
    public static boolean even(int num) {
        return num % 2 == 0;
    }

}
