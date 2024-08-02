package com.neuedu.oop;

public class Student {
    /**
     * 学号
     */
    private String sno;

    /**
     * 姓名
     */
    private String sname;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private int age;

    /**
     * 期中成绩
     */
    private double midtermScore;

    /**
     * 期末成绩
     */
    private double finalScore;

    /**
     * 综合出成绩
     */
    private double compScore;

    /**
     * 空的构造方法
     */
    public Student(){

    }

    /**
     * 带参数的构造方法
     * @param sno 学号
     * @param sname 姓名
     * @param sex 性别
     * @param age 年龄
     * @param midtermScore 期中成绩
     * @param finalScore 期末成绩
     */
    public Student(String sno, String sname, String sex, int age, double midtermScore, double finalScore) {
        this.sno = sno;
        this.sname = sname;
        this.sex = sex;
        this.age = age;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }


    /**
     * 计算学生最终成绩
     * @param student 学生
     * @return 学生最终成绩
     */
    public double getScore(Student student){
        return student.getCompScore();
    };

    /**
     * 打印学生全部信息的方法
     * @param student 输入学生
     */
    public void getInstance(Student student){
        System.out.println(student.sno + " " + student.sname + " " + student.sex
                + " " + student.age + " " + student.getScore(student));
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMidtermScore() {
        return midtermScore;
    }

    public void setMidtermScore(double midtermScore) {
        this.midtermScore = midtermScore;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public double getCompScore() {
        return compScore;
    }

    public double setCompScore(double compScore) {
        this.compScore = compScore;
        return this.compScore;
    }
}
