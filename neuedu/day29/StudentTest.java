package com.neuedu.day29;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(50,50);
        try {
            s1.getScore();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
