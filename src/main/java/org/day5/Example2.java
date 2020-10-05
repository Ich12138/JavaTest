package org.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example2 {//统计单词的频率
    int count = 0;
    Map<String, Integer> map = new HashMap<String, Integer>();
    String temp[] = null;

    public void Tongji(String str) {
        temp = str.split(" ");
        System.out.println(temp);
        for (int i = 0; i < temp.length; i++) {
            if (map.containsValue(temp[i])) {
                map.put(temp[i], count++);
            } else {
                map.put(temp[i], 1);
            }

        }

        System.out.println("各个单词出现的次数");
        for (String v : map.keySet()) {
            System.out.println("单词" + v + "出现的次数：" + map.get(v));

        }
    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        System.out.println("请输入英文句子 单词与单词之间空格分开");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        example2.Tongji(str);
    }
}
