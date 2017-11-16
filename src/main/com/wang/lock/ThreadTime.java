package com.wang.lock;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-11-0317:24
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
public class ThreadTime {

    public static long begin = System.currentTimeMillis();

    public static synchronized void test1() {

        try {
            Thread.sleep(3000);
            long end = System.currentTimeMillis();

            System.out.println(Thread.currentThread().getName() + "-  -  -> test1 = " + (end - begin));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void test2() {

        try {
            Thread.sleep(3000);
            long end = System.currentTimeMillis();

            System.out.println(Thread.currentThread().getName() + "-  -  -> test2 = " + (end - begin));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Th1());

        Thread t2 = new Thread(new Th2());

        t1.start();
        Thread.currentThread().setName("test1");

        t2.start();
        Thread.currentThread().setName("test2");
    }

}

class Th1 implements Runnable {
    @Override
    public void run() {
        ThreadTime.test1();
    }
}

class Th2 implements Runnable {
    @Override
    public void run() {
        ThreadTime.test2();
    }
}

