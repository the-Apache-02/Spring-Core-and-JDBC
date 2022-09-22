/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring;

/**
 *
 * @author risha
 */
public class Student {

    private String studentName;
    private int studentId;
    private String studentAddress;

    public String getStudentName() {
 System.out.println("getN");
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("setn");
        this.studentName = studentName;
    }

    public int getStudentId() {
 System.out.println("getI");
        return studentId;

    }

    public void setStudentId(int studentId) {
 System.out.println("seti");
        this.studentId = studentId;
    }

    public String getStudentAddress() {
 System.out.println("getA");
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
 System.out.println("setA");
        this.studentAddress = studentAddress;
    }


    public Student(String studentName, int studentId, String studentAddress) {
        super();
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
    }

public String toString(){
return "Student :::: Id="+studentId+"Name="+studentName+"Address="+studentAddress+"";
}

}
