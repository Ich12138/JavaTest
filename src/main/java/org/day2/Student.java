package org.day2;

public class Student {
    private int number;
    private String clas;
    private String sex;
    private int age;

    public Student(int number, String clas, String sex, int age) {
        this.number = number;
        this.clas = clas;
        this.sex = sex;
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
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

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", clas='" + clas + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
