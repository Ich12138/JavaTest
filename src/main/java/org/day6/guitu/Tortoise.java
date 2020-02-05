package org.day6.guitu;

import java.text.SimpleDateFormat;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;

public class Tortoise extends Animal {


    Tortoise(String name, int speed, ExecutorService executor, CyclicBarrier barrier) {
        super(name, speed, executor, barrier);
    }
    Tortoise(String name, int speed, ExecutorService executor) {
        super(name, speed, executor);
    }


    @Override
    public void run() {
        System.out.println();
        try {
            Thread.sleep(1000);
            barrier.await();
        } catch (Exception e1) {
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(System.currentTimeMillis()));
        while (!FINISH) {
            System.out.println(this.name + " : 我的速度是：" + this.speed + " 米，我跑了"+this.now+"米" );

            try {
                if (this.now%100==0){
                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {
            }
            now += speed;
            finish();
        }
    }


}


