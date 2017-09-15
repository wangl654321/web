package com.wang;

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
    private static Integer i = 0;

    public static void main(String[] args) {
        for (int j = 0; j < 100; j++) {
            Thread th = new Thread() {
                @Override
                public void run() {
                    synchronized (Threads.class) {
                        ++i;
                        System.out.println(this.getName() + ":" + i);
                    }
                }
            };
            th.start();
        }
    }
}
