package com.wang;

/***
 *
 *
 * 描    述：利用多线程设计一个程序，同时输出 50 以内的奇数和偶数，以及当前运行的线程名。
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1815:58
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
public class NumThread {
    public static void main(String[] args) {
        OneNum oneNum = new OneNum();
        Thread thread1 = new Thread(oneNum);
        Thread thread2 = new Thread(oneNum);
        thread1.setName("甲:");
        thread2.setName("乙:");
        thread1.start();
        thread2.start();
    }
}

class OneNum implements Runnable {

    static int num = 1;

    @Override
    public void run() {
        while (num < 51) {
            synchronized (this) {
                notify();
                if (num % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " 偶数 = " + num);
                } else {
                    System.out.println(Thread.currentThread().getName() + " 奇数 = " + num);
                }
                ++num;
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
