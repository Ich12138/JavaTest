package org.day2;

public class MyTest {
    public int age = 2;

    public MyTest() {
    }

    public MyTest(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void MyName() {


        System.out.println("1111111111111");
    }

    public String MyAge() {

        String a = "aaaa";
        return a;
    }


    public static void main(String[] args) {
        MyTest mytest = new MyTest();


        mytest.setAge(1);
        int a = mytest.getAge();
        System.out.println(a);

    }
}
