package org.day6.Jiouthread;

public class Num {//两个线程，一个打印奇数，一个打印偶数
    int i = 1;
    boolean flag = false;


    public static void main(String[] args) {
        Num num = new Num();
        PrintOdd printOdd = new PrintOdd(num);
        PrintEven printEven = new PrintEven(num);
        Thread thread1 = new Thread(printOdd);
        Thread thread2 = new Thread(printEven);

        thread1.start();
        thread2.start();
    }
}
