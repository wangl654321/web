package com.wang;

import org.junit.Test;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1410:22
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
public class MainThread extends Thread {

    private static Integer i = 0;

    public void run() {
        for (int j = 0; j < 10000; j++) {
            ++i;
            System.out.println(this.getName() + ":" + i);
        }

    }

    @Test
    public void sysThread() {
        start();
    }
}
