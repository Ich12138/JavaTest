package org.day10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class Ht{
    public int age = 0;
}

public class Demo {
    public String[] strs = {"surprise","happy","ctrip","travel","wellcome","student","system","program","editor"};

    public static void main(String[] args) {
        int res = birth();
        System.out.println(res);
    }

    public static String optStr(String world) {
        System.out.println("surprize".hashCode());
        System.out.println("surprise".hashCode());
        return "aaa";
    }


    //生海豚的题
    public static int birth() {
        LinkedList<Ht> htLinkedList = new LinkedList<>();
        int i = 0;//海豚数
        int n = 0;//海豚寿命
        int m = 0;//海豚生宝宝的年份数量
        int x = 0;//几年后
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        n = sc.nextInt();
        m = sc.nextInt();


        for (int j = 0; j < i; j++) {
            Ht ht = new Ht();
            ht.age = n;
            htLinkedList.add(ht);
        }

        int[] birthYear = new int[m];
        for (int j = 0; j < m; j++) {
            birthYear[j] = sc.nextInt();
        }

        x = sc.nextInt();

        int k = 1;//第几年
        int l = 0;
        while (true) {
            if(k > x ) {
                break;
            }
            if(l >= m) {
                break;
            }
            if(k == birthYear[l]){
                int num = htLinkedList.size();
                for (int j = 0; j < num; j++) {
                    htLinkedList.get(i).age+=k;
                    htLinkedList.add(new Ht());
                }
                l++;
            }

            k++;


        }

        return htLinkedList.size();
    }
}
