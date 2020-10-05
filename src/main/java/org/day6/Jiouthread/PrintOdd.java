package org.day6.Jiouthread;

public class PrintOdd implements Runnable {
    Num num;

    public PrintOdd(Num num) {
        this.num = num;
    }

    public void run() {


        while (num.i <= 100) {
            synchronized (num) {
                if (num.flag) {
                    try {
                        num.wait();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("奇数----" + num.i);
                    num.i++;
                    num.flag = true;
                    num.notify();
                }
            }
        }
    }


}
