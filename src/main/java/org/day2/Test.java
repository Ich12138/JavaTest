package org.day2;

public class Test {
    public static void main(String[] args) {
        System.out.println("=====================1=========================");
        //第一小一题
        Student student = new Student(123456, "xxx", "xx", 18);
        System.out.println(student.toString());

        //第二小题
        System.out.println("=====================2=========================");
        Count count = new Count();

        count.nowcount();
        System.out.println("给计数器加一");
        count.decrement();
        count.nowcount();
        System.out.println("给计数器减一");
        count.nowcount();
        System.out.println("给计数器清零");
        count.reset();
        count.nowcount();

        //第三小题
        System.out.println("=====================3=========================");
        Rectangle rectangle = new Rectangle(12, 6);
        System.out.println("该矩形的周长为：" + rectangle.Length());
        System.out.println("该矩形的面积为：" + rectangle.Stace());

    }
}
