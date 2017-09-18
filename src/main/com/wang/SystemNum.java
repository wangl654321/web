package com.wang;

/***
 *
 *
 * 描    述：线程交替打印1-100
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1813:26
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
public class SystemNum {

    public static void main(String[] args) {
        PrintlnNum printlnNum = new PrintlnNum();
        Thread thread1 = new Thread(printlnNum);
        Thread thread2 = new Thread(printlnNum);
        thread1.setName("甲:");
        thread2.setName("乙:");
        thread1.start();
        thread2.start();
    }
}

class PrintlnNum implements Runnable {
    int num = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + num);
                    ++num;
                } else {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
