package com.neuedu.oop;

public class LiteratureStudent extends Student{
    /**
     * 演讲成绩
     */
    private double speechScore;

    /**
     * 作品成绩
     */
    private double worksScore;

    /**
     * 空的构造方法
     */
    public LiteratureStudent(){

    }

    /**
     * 对父类的方法重写
     * @param sno 学号
     * @param sname 姓名
     * @param sex 性别
     * @param age 年龄
     * @param midtermScore 期中成绩
     * @param finalScore 期末成绩
     * @param speechScore 演讲成绩
     * @param worksScore 作品成绩
     */
    public LiteratureStudent(String sno, String sname, String sex, int age,
                             double midtermScore, double finalScore, double speechScore, double worksScore) {
        super(sno, sname, sex, age, midtermScore, finalScore);
        this.speechScore = speechScore;
        this.worksScore = worksScore;
    }

    @Override
    public double getScore(Student student){
        return super.setCompScore(0.35 * this.speechScore + 0.35 * this.worksScore
                + 0.15 * super.getMidtermScore() + 0.15 * super.getFinalScore());
    }

}
