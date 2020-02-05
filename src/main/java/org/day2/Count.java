package org.day2;

public class Count {
    private int count = 10;

    public void increment(){
        count=count+1;
    }
    public void decrement(){
        count=count-1;

    }
    public void reset(){
        count = 0;
    }
    public void nowcount(){
        System.out.println("现在的count为："+count);
    }

}
