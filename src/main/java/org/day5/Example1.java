package org.day5;

import java.util.Scanner;

public class Example1 {//统计字符串大小写字母个数

    int Acount = 0;
    int acount = 0;
    int othercount = 0;

    public void Tojiacount(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                Acount++;
            } else if (ch >= 'a' && ch <= 'z') {
                acount++;
            } else {
                othercount++;
            }

        }
        System.out.println("大写字母的个数：" + Acount + "  " + "小写字母的个数" + acount + " " + "非英文字母的个数" + othercount);
    }

    public static void main(String[] args) {

        System.out.println("==========================1==========================");
        Example1 example1 = new Example1();
        System.out.println("请输入一串字符（想怎么输怎么输）");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        example1.Tojiacount(str);


    }
}
