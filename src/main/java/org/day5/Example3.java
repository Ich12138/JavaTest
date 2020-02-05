package org.day5;

import java.util.Random;

public class Example3 {//随机生成5个不重复的小写字母 并排序
    public static void main(String[] args) {
        int num = 5;
        char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z' };
        int len = ch.length;
        char[] result = new char[num]; // 用于存放抽取结果
        boolean[] flags = new boolean[len];
        for (int i = 0; i < num; i++) {
            int r;
            do {
                r = random(len);
            } while (flags[r]);// 如果出现重复，重新抽取
            result[i] = ch[r];
            flags[r] = true;

        }
        System.out.println("随机生成5个小写字母：");
        System.out.println(result);
        bubbleSort(result);
        System.out.println("排序后输出：");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    private static void bubbleSort(char[] result) {//冒泡算法排序
        int len = result.length;
        for (int i = 1; i < len; i++) {
            boolean asc = true;
            for (int j = len - 1; j >= i; j--) {
                if (result[j] < result[j - 1]) {
                    swap(result, j, j - 1);
                    asc = false;
                }
            }

            if (asc)
                return;
        }
    }

    private static void swap(char[] result, int i, int j) {
        char temp = result[i];
        result[i] = result[j];
        result[j] = temp;
    }

    private static int random(int n) {
        Random r = new Random();
        return r.nextInt(n);
    }
}
