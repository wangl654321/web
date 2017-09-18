package com.wang;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1816:24
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
public class Threadprint extends Thread {
    int k = 1;

    public void run() {
        int i = k;
        while (i < 50) {
            System.out.println(Thread.currentThread().getName() + "-----" + i);
            i += 2;
        }
        System.out.println(Thread.currentThread().getName() + " end!");
    }

    public static void main(String[] args) {
        Threadprint t1 = new Threadprint();
        Threadprint t2 = new Threadprint();
        t1.k = 1;
        t2.k = 2;
        t1.start();
        t2.start();
    }
}
