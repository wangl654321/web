package com.wang;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-2914:42
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
public class TestString {
    public static void main(String[] args){
        int[] a = {9, 4, 2, 3, 2, 2, 6, 3, 3};

        /*String value = "[6, 4, 0, 0, 0]";

        *//*for (int i = 0; i < a.length ; i++) {
            if (a.toString().indexOf(2) == -1) {
                System.out.println(a[i]);
            }
        }*//*

        int i = value.indexOf(2+"");
        int i1 = value.indexOf(9+"");

        System.out.println(i);
        System.out.println(i1);*/
        for (int i = 0; i < a.length ; i++) {
            if(a[i] > 4)
                System.out.println(a[i]+"<--------");
                System.out.println("11111111");
                System.out.println("22222");
                System.out.println("333333");
        }
    }
}
