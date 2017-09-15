package com.wang;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1414:26
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
public class WindowThread {
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();
        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();
    }
}

class Window extends Thread {

    static int num = 100;

    public void run() {

        for (int i = 1; i < num; i--) {
            synchronized (Window.class) {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票，票号:" + num);
                    --num;
                }
            }
        }
    }
}
