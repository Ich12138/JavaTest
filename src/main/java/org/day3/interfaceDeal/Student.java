package org.day3.interfaceDeal;

import org.day3.CameraPhone;

public class Student {
    private String name;
    private CameraPhone myphone;//手机类型

    public Student(String name, CameraPhone myphone) {
        this.name = name;
        this.myphone = myphone;


    }

    public void myCall() {
        myphone.call(name);
    }
}
