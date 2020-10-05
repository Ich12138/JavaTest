package org.day1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class Test {
    public static void main(String[] args) {

//        myInvoke(new MyCallBack() {
//            public void callBack(String key) {
//                System.out.println(key);
//            }
//        }, "哈哈哈");
        ReferenceQueue<A> referenceQueue = new ReferenceQueue<A>();
        byte[] bytes = new byte[1024 * 1024 * 6];
        A aa = new A();
        SoftReference<A> softReference = new SoftReference<A>(aa, referenceQueue);
        byte[] bytes1 = new byte[1024 * 1024 * 4];

    }
}

class A {
    public int a = 100;
}
