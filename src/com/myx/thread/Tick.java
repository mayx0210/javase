package com.myx.thread;

/**
 * 模拟窗口售票
 *
 * 方式一：同步代码块
 * synchronized(同步监视器）{
 *     //需要同步的代码
 * }
 *
 * 说明：1、操作共享数据的代码，即为需要被同步的代码
 *      2、共享数据：多个线程共同操作的变量，比如ticks就是共享数据
 *      3、同步监视器，俗称：锁，任何一个类的对象，都可以充当锁
 *      要求：多个线程必须要共用同一把锁
 * 补充：在实现Runnable接口创建多线程的方式中，我们可以考虑使用this充当同步监视器
 *      在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器
 *
 * 方式二：同步方法
 *      1、同步方法仍然涉及到同步监视器，只是不需要我们显示的声明
 *      2、非静态的同步方法，同步监视器是this，静态的同步方法，同步监视器是往前类本身
 */

public class Tick {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

      /*  Window1 window1 = new Window1();
        Thread t1 = new Thread(window1);
        Thread t2 = new Thread(window1);
        Thread t3 = new Thread(window1);


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();*/
    }
}

class Window extends Thread {
    private static int ticks = 100;
    private static Object  obj = new Object();
    @Override
    public void run() {
        synchronized(obj) {
            while (ticks > 0) {
                System.out.println(Thread.currentThread().getName() + "售票号为：" + ticks);
                ticks--;
            }
        }
    }
}

class Window1 implements Runnable {

    private  int ticks = 100;
    private Object obj = new Object();
    @Override
    public void run() {

        synchronized (obj) {
            while (ticks > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "售票号为："+ ticks);
                ticks --;
            }
        }
    }
}