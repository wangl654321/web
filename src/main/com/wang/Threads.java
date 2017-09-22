package com.wang;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1410:15
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
public class Threads {

    // private  static AtomicInteger i = new AtomicInteger(0);
    private static int i = 0;
    private static Lock lock = new ReentrantLock();// 锁对象

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int j = 0; j < 100; j++) {
            Thread th = new Thread() {
                @Override
                public void run() {
                    //synchronized (Threads.class) {
                    //  ++i;
                        lock.lock();
                    i = i + 1;
                    System.out.println(this.getName() + ":" + i);
                        lock.unlock();
                    // }
                }
            };
            th.start();
            th.join();
        }
        long end = System.currentTimeMillis();
        System.out.print(end - begin); //112455，111404，109122
    }
}
