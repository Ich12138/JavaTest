package org.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {//正则表达式验证给定的用户名是否合法 只能以英文字母开头 字符只能包含字母，下划线，数字 长度必须在6-20位

    private static void isNameAdressFormat(String str) {
        String a = str.substring(0, 1);
        boolean isExist = false;

        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(str);
        boolean b = m.matches();
        if (b) {
            System.out.println("符合首字母为地址");
            isExist = true;
        } else {
            System.out.println("用户名不合法（因为首字母不是字母）");
        }

        if (str.length() >= 6 && str.length() <= 20) {
            System.out.println("位数符合");
        } else {
            System.out.println("字符太长或太短，用户名不符合");
        }


    }

    public static void main(String[] args) {

        Example7.isNameAdressFormat("sadkda");
    }
}
