package com.neuedu.day0731;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        int n = 100_000_000;
        getTimeByArrayList(n);
        getTimeByLinkedList(n);
    }

    public static void getTimeByArrayList(int n){
        long start = System.currentTimeMillis();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list1.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("使用ArrayList向开头添加了" + n + "个元素所用的时间为" + (end - start) + "ms");
    }
    public static void getTimeByLinkedList(int n){
        long start = System.currentTimeMillis();
        LinkedList<Integer> list2 = new LinkedList<>();
        for(int i = 0; i<n; i++){
            list2.addFirst(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("使用LinkedList向开头添加了" + n + "个元素所用的时间为" + (end - start) + "ms");
    }
}
