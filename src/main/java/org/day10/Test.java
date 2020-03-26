package org.day10;

public class Test {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 4 , 2, 8 , 10, 21, 14, 23};
//        Demo d = new Demo();
//        int res = d.findKth(arr, 9);
//        System.out.println(res);
        int res = getDivision(10);
        System.out.println(res);
    }

    public static int getDivision(int n){
        try{
            n+=1;
            if(n/0 > 0){
                n+=10;
            } else {
                n-=10;
            }
            return n;
        }catch(Exception e){
            n++;
        }
        n++;
        return n++;
    }

}
