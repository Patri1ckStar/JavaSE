package com.neuedu.oop;

public class EnglishStudent extends Student{
    /**
     * 演讲成绩
     */
    private double speechScore;

    /**
     * 空的构造方法
     */
    public EnglishStudent(){

    }

    /**
     * 带参数的构造方法
     * @param sno 学号
     * @param sname 姓名
     * @param sex 性别
     * @param age 年龄
     * @param midtermScore 期中成绩
     * @param finalScore 期末成绩
     * @param speechScore 演讲成绩
     */
    public EnglishStudent(String sno, String sname, String sex, int age,
                          double midtermScore, double finalScore, double speechScore) {
        super(sno, sname, sex, age, midtermScore, finalScore);
        this.speechScore = speechScore;
    }

    /**
     * 重写父类算成绩的方法
     * @param student 学生
     * @return 学生成绩
     */
    @Override
    public double getScore(Student student) {
     return super.setCompScore(0.5 * speechScore + 0.25 * super.getMidtermScore() + 0.25 * super.getFinalScore());
    }
}
