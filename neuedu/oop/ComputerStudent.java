package com.neuedu.oop;

public class ComputerStudent extends Student{
    /**
     * 操作成绩
     */
    private double operationScore;

    /**
     * 英语写作成绩
     */
    private double writingScore;

    /**
     * 空的构造方法
     */
    public ComputerStudent(){

    }

    /**
     * 带参数的构造方法
     * @param sno 学号
     * @param sname 姓名
     * @param sex 性别
     * @param age 年龄
     * @param midtermScore 期中成绩
     * @param finalScore 期末成绩
     * @param operationScore 操作成绩
     * @param writingScore 英语写作成绩
     */
    public ComputerStudent(String sno, String sname, String sex, int age, double midtermScore,
                           double finalScore, double operationScore, double writingScore) {
        super(sno, sname, sex, age, midtermScore, finalScore);
        this.operationScore = operationScore;
        this.writingScore = writingScore;
    }

    @Override
    public double getScore(Student student){
        return super.setCompScore(0.4 * this.operationScore + 0.2 * this.writingScore
                + 0.2 * super.getMidtermScore() + 0.2 * super.getFinalScore());
    }
}
