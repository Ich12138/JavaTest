package org.day5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Example5 {//日期相关的方法类

    public static void Tonight(){

        Date today = new Date();
//        System.out.println(new SimpleDateFormat
//                ("yyyy-MM-dd hh:mm:ss").format(today));
        Date yesterday = new Date(today.getTime() - 86400000L);//86400000L是一天
        System.out.println("昨天的日期是：");
        System.out.println(new SimpleDateFormat("yyyy年 MM月 dd日").format(yesterday));
    }

    public static void Firstday(){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 MM月 dd日");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        String firstday = sdf.format(cal.getTime());

        System.out.println("本周第一天的日期：");
        System.out.println(firstday);

    }

    public static void FirstMonth(){

        SimpleDateFormat format = new SimpleDateFormat("yyyy年 MM月 dd日");

        Calendar cale ;

        cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        String firstday = format.format(cale.getTime());
        System.out.println("当月的第一天");
        System.out.println(firstday);


    }

    public static void LastMonth(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy年 MM月 dd日");
        Calendar   cale=Calendar.getInstance();//获取当前日期
        cale.add(Calendar.MONTH, -1);
        cale.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        String firstDay = format.format(cale.getTime());
        System.out.println("前一个月的第一天");
        System.out.println(firstDay);

    }

    public static void lastWeekend(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 MM月 dd日");
        Calendar cal = Calendar.getInstance();
        String firstday = sdf.format(cal.getTime());
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
        if (dayofweek == 1) {
            dayofweek += 7;
        }
        cal.add(Calendar.DATE, 2 - dayofweek - 7);
        System.out.println("上周的第一天");
        System.out.println(firstday);

    }

    public static void main(String[] args) {
        Example5.Tonight();//获取昨日的时间
        Example5.Firstday();//获取本周第一天的日期
        Example5.FirstMonth();//获取改日期当月的第一天
        Example5.LastMonth();//前一个月的第一天
        Example5.lastWeekend();//上周的第一天

    }
}
