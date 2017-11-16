package com.wang;

import java.math.BigDecimal;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-2714:22
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
public class TestNumEq {
    public static void main(String[] args) {
        int[] a = {9, 4, 2, 3, 2, 2, 6, 3, 3};
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }

        int k = 0;
        for (int i = 1; i < a.length; i++) {

            if (a[k] != a[i]) {
                a[k + 1] = a[i];
                k++;
            }
        }

        for (int i = 0; i <= k; i++) {
            System.out.println(a[i]);
        }
    }
}
