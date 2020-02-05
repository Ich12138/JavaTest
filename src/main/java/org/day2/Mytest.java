package org.day2;

public class Mytest {
    public  int age=2;
    public Mytest(){}
    public Mytest(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Myname(){


        System.out.println("1111111111111");
    }
    public  String Myage(){

        String a ="aaaa";
        return a;
    }


    public static void main(String[] args) {
        Mytest mytest= new Mytest();


        mytest.setAge(1);
        int a = mytest.getAge();
        System.out.println(a);

    }
}
