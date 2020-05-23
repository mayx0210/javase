package com.myx.thread;


/**
 * 多线程的创建，方式一：继承于Thread类
 * 1、创建一个继承于Thread类的子类
 * 2、重写Thread类中的run() --> 将此线程执行的操作声明在run()中
 * 3、创建Thread类的子类的对象
 * 4、通过此对象调用start() a、启动线程  b、调用当前线程的run()
 * 遍历100以内所有的偶数
 */


public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        // 问题一：我们不能通过直接调用run()的方式启动线程
        // 问题二：再启动一个线程，遍历100以内的偶数，不可以让已经start()的线程器执行，会报IllegalThreadStateException异常


        //创建Thread类的匿名子类的方式
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + i);
                    }
                }
            }
        }.start();

    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
