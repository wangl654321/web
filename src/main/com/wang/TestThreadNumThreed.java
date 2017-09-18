package com.wang;

import sun.tools.jar.Main;

/***
 *
 *
 * 描    述：编写一个继承Thread类的方式实现多线程的程序。该类MyThread有两个属性，一个字符串WhoAmI代表线程名，
 一个整数delay代表该线程随机要休眠的时间。构造有参的构造器，线程执行时，显示线程名和要休眠时间。
 另外，定义一个测试类TestThread，创建三个线程对象以展示执行情况。
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1815:37
 * 创建描述：
 *
 * 修 改 者：  
 * 修改时间： 
 * 修改描述： 
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */
public class TestThreadNumThreed {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("线程1",(int)(Math.random()*100));
        MyThread myThread2 = new MyThread("线程2",(int)(Math.random()*100));
        MyThread myThread3 = new MyThread("线程3",(int)(Math.random()*100));
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}

class MyThread extends Thread {

    private String threadName;

    private int sleepTime;

    public MyThread(String threadName, int sleepTime) {
        this.threadName = threadName;
        this.sleepTime = sleepTime;
    }

    public void run() {
        try {
            sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + "   ,睡眠时间  " + sleepTime + "   ,milliseconds");
    }
}
