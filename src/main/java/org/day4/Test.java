package org.day4;

import java.util.Scanner;

class Test {//数组越界的例子
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生信息，如：张思晴 123456789123 女 网络工程 4）");
        while (true) {
            //s.nextLine();
            String stuInfo = s.nextLine();
            if (stuInfo.equals("end")) {
                break;
            }
            String[] str = null;
            try {
                str = stuInfo.split(" ");
                for (int i = 0; i <5 ; i++) {
                    System.out.println(str[i]);
                }

            } catch (Exception e) {
                System.out.println("输入错误，请重新输入1");
            }

            try {
                if (str.length != 5) {
                    System.out.println("输入错误，请重新输入2");
                }
            } catch (Exception e) {
                System.out.println("输入错误，请重新输入3");
            }
        }
    }

}
