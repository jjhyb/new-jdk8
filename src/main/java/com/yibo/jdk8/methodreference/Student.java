package com.yibo.jdk8.methodreference;

/**
 * @author: huangyibo
 * @Date: 2019/2/28 16:40
 * @Description:
 */
public class Student {

    private String name;

    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int compareStudentBySocre(Student student1,Student student2){
        return  student1.getScore() - student2.getScore();
    }

    public static int compareStudentByName(Student student1,Student student2){
        return  student1.getName().compareTo(student2.getName());
    }

    public int compareBySocre(Student student){
        return  this.getScore() - student.getScore();
    }

    public int compareByName(Student student){
        return  this.getName().compareTo(student.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
