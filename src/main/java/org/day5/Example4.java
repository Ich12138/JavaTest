package org.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Example4 {//返回两个给定日期相差的天数

    public static int comparePastDate(String oldDate, String nowDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        Date old;
        int day = 0;
        try {
            old = sdf.parse(oldDate);
            calendar.setTime(old);
            Long oTime = calendar.getTimeInMillis();
            Date now = sdf.parse(nowDate);
            calendar.setTime(now);
            Long nTime = calendar.getTimeInMillis();
            day = (int) ((nTime - oTime) / (3600F * 1000 * 24));
        } catch (ParseException e) {
        }
        return day;
    }

    public static void main(String[] args) {
        System.out.println("请输入第一个日期：以如下格式（yyyy-MM-dd HH:mm:ss）");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        String oldDate = scanner.nextLine();
        System.out.println("请输入第二个日期：以如下格式（yyyy-MM-dd HH:mm:ss）");
        String newDate = scanner1.nextLine();


        System.out.println(oldDate+","+newDate);
        int day = Example4.comparePastDate(oldDate,newDate);
        System.out.println(day);
    }
}
