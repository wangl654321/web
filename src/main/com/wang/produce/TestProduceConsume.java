package com.wang.produce;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1813:52
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
public class TestProduceConsume {
    public static void main(String[] args) {

    }
}

class Clerk {
    int num;


}

//生产者
class Produce implements Runnable {

    Clerk clerk;

    @Override
    public void run() {
        System.out.println("生产者开始生产数据");
    }
}

//消费者
class Consume implements Runnable {

    @Override
    public void run() {

    }
}