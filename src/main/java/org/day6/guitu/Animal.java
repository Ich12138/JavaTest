package org.day6.guitu;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;

public abstract class Animal implements Runnable {


    protected String name;//动物名称


    protected int speed;//动物速度


    protected int now;//当前已经跑的路程


    protected ExecutorService executor;//线程管理器，方便结束线程


    protected CyclicBarrier barrier;//等待计时器，要求两个参赛选手 都准备就绪后才  开始比赛


    public static volatile boolean FINISH = false;//是否比赛完成的标记


    public final static int SUCCESS = 1000;//比赛的路程


    Animal(String name, int speed, ExecutorService executor, CyclicBarrier barrier) {
        this.name = name;
        this.speed = speed;
        this.executor = executor;
        this.barrier = barrier;
    }


    Animal(String name, int speed, ExecutorService executor) {
        this.name = name;
        this.speed = speed;
        this.executor = executor;
    }



    public abstract void run();

    //判断是否完成比赛
    protected void finish() {
        if (now >= SUCCESS) {
            System.out.println(name + " 赢得了比赛!");
            FINISH = true;
            executor.shutdownNow();
        }
    }
}
