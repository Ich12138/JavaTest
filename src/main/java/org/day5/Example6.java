package org.day5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example6 {//正则表达式查找某个单词出现的频率

    public static void Count(String str, String word) {

        Pattern p = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println(word + ":" + count);
    }

    public static void main(String[] args) {
        System.out.println("请输入字符串 用空格个隔开：（This is a cat）");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("请输入要查找的单词：");
        Scanner scanner1 = new Scanner(System.in);
        String word = scanner1.nextLine();
        Example6.Count(str, word);
    }
}
