package org.day4;

public class ExceptionTest1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        try {
            int c = b / a;


        } catch (Exception e) {

            System.out.println("异常信息：" +
                    "" + e.getMessage());

        } finally {
            System.out.println("0是不能当除数的");
        }


    }
}
