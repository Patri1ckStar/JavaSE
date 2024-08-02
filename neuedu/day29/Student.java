package com.neuedu.day29;

public class Student {
    /**
     *平时成绩
     */
    double usualScore;
    /**
     * 期末成绩
     */
    double finalScore;

    /**
     * 最终成绩
     */
    double grade;

    /**
     * 构造方法
     */
    public Student() {
    }

    /**
     * 构造方法
     * @param finalScore 期末成绩
     * @param usualScore 期中成绩
     */
    public Student(double finalScore, double usualScore) {
        this.finalScore = finalScore;
        this.usualScore = usualScore;
    }

    public void getScore() throws Exception{
        grade = (finalScore + usualScore) / 2;
        if(grade < 60){
            throw new Exception("成绩异常");
        }
        System.out.println("最终成绩为" + grade);
    }
}
