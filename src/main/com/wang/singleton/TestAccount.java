package com.wang.singleton;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1511:33
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
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        Thread thread1 = new Thread(account);
        Thread thread2 = new Thread(account);
        thread1.setName("张三存的");
        thread2.setName("李四存的");
        thread1.start();
        thread2.start();
    }
}

class Account implements Runnable {

    int money = 0;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (Account.class) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                money += 1000;
                System.out.println(Thread.currentThread().getName()+"金额：" + money);
            }
        }
    }
}
