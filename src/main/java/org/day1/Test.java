package org.day1;

public class Test {
    public static void main(String[] args) {

        myInvoke(new MyCallBack() {
            public void callBack(String key) {
                System.out.println(key);
            }
        }, "哈哈哈");
    }
    public static void myInvoke(MyCallBack myCallBack, String world){
        myCallBack.callBack(world);
    }
}
