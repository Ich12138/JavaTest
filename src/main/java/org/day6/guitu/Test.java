package org.day6.guitu;

import java.text.SimpleDateFormat;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {


    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);


        CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() {

            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println("参赛选手准备就绪；比赛开始! " + sdf.format(System.currentTimeMillis()));
            }
        });


        Rabbit rabbit = new Rabbit("小白兔", 5, es, barrier);
        Tortoise tortoise = new Tortoise("乌龟", 1, es, barrier);


        es.submit(rabbit);
        es.submit(tortoise);
        es.shutdown();


    }


}
