package com.yibo.jdk8.methodreference;

/**
 * @author: huangyibo
 * @Date: 2019/2/28 17:14
 * @Description:
 */
public class StudentComparator {

    public int compareStudentBySocre(Student student1,Student student2){
        return  student1.getScore() - student2.getScore();
    }

    public int compareStudentByName(Student student1,Student student2){
        return  student1.getName().compareTo(student2.getName());
    }
}
