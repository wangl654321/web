package com.wang.singleton;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1510:51
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
public class SingleTonTest {
    public static void main(String[] args) {
        SingleTon singleTon1 = SingleTon.getSingleTon();
        SingleTon singleTon2 = SingleTon.getSingleTon();
        System.out.println(singleTon1 == singleTon2);
    }
}

class SingleTon {

    private SingleTon() {
    }

    private static SingleTon singleTon = null;

    public static SingleTon getSingleTon() {
        if (null == singleTon) {
            synchronized (SingleTon.class) {
                if (null == singleTon) {
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }
}

class SinglesTwo {
    private SinglesTwo() {
    }

    private static SinglesTwo singlesTwo = null;

    public static SinglesTwo getSinglesTwo() {
        if (null == singlesTwo) {
            synchronized (SinglesTwo.class) {
                if (null == singlesTwo) {
                    singlesTwo = new SinglesTwo();
                }
            }
        }
        return singlesTwo;
    }
}
