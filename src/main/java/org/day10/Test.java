package org.day10;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4 , 2, 8 , 10, 21, 14, 23};
        Demo d = new Demo();
        int res = d.findKth(arr, 9);
        System.out.println(res);
    }
}
