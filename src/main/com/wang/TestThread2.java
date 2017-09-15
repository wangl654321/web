package com.wang;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1413:28
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
public class TestThread2 {

    public static void main(String[] args) {
        subThread subThread = new subThread();
        subThread.setName("子线程");
        subThread.setPriority(Thread.MAX_PRIORITY);
        subThread.start();
        Thread.currentThread().setName("====主线程");
        for (int i = 0; i <= 100; i++) {

           /* if(i % 10 == 0){
                Thread.currentThread().yield();
            }*/
            System.out.println(Thread.currentThread().getName() + ":" + i);
            /*if(i == 20){
                try {
                    subThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/
        }
        //System.out.println(subThread.isAlive());
    }

}

//创建thread
class subThread1 extends Thread {
    //重写run方法
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
