package org.day3.interfaceDeal;

public class Testinterface {
    public static void main(String[] args) {
        Student student = new Student("张三", new NokiaPhone());
        Student student1 = new Student("李四",new MotoPhone());

        student.myCall();
        student1.myCall();
    }
}
