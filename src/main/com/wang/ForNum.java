package com.wang;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-1816:20
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
public class ForNum {
    public static void main(String[] args){
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(" 偶数 = " + i);
            } else {
                System.out.println(" 奇数 = " + i);
            }
        }
    }
}
