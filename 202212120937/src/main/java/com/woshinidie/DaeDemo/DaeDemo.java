package com.woshinidie.DaeDemo;

import java.util.concurrent.TimeUnit;

public class DaeDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t开始运行," +
                    (Thread.currentThread().isDaemon() ? "守护线程" : "用户线程"));
            while (true){

            }
        }, "t1");
        t1.setDaemon(true);
        t1.start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ "\t------end 主线程");
    }
}
