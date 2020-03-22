package org.day10;

import java.util.Arrays;

public class Demo {
    public int findKth(int[] arr, int k) {
        //快速排序 时间复杂度 O(nlog(n))
        quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
        int count = 0 ;
        for (int v: arr) {
            if(v%2 ==0){
                count++;
            }
        }

        if(count < k){
            return 0;
        }
        return 1;
    }

    //只排奇数的快排
    public void quickSort(int[] arr,int low, int high) {
        if(low >= high) {
            return;
        }

        int key = arr[low];
        int low1 = low;
        int high1 = high;
        while (low1 < high1) {
            while (low1<high1 && key <= arr[high1] ) {
                high1--;
            }

            arr[low1] = arr[high1];

            while (key >= arr[low1] && low1< high1){
                low1++;
            }

            arr[high1] = arr[low1];
        }

        arr[low1] = key;
        quickSort(arr, low, low1-1);
        quickSort(arr, low1+1, high);

    }
}
