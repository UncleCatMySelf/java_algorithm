package com.myself.algorithm.sort.template;

import lombok.Data;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:06 2018\7\31 0031
 */
@Data
public class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * 定义Student的compareTo函数，如果分数相等，则按照名字的字母序排序
     * 如果分数不等，则分数高的靠前
     * @param o
     * @return
     */
    @Override
    public int compareTo(Student o) {
        if (this.score < o.score){
            return -1;
        }else if(this.score > o.score){
            return 1;
        }else{
            return this.name.compareTo(o.name);
        }
    }

    /**
     * 定义Student实例的打印输出方式
     * @return
     */
    @Override
    public String toString() {
        return "Student: " + this.name + " " + Integer.toString( this.score );
    }

}
