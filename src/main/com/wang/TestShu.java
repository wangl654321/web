package com.wang;

import java.util.*;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-2716:17
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
public class TestShu {
    public static void main(String[] args) {

       /* int[] a = {9, 4, 2, 3, 2, 2, 6, 3, 3};
        List<Integer> list = new ArrayList();
        list.add(a[0]);
        for (int i = 1; i < a.length; i++) {
            if (list.toString().indexOf(a[i]+"") == -1) {
                list.add(a[i]);
            }
        }
        System.out.println(list);*/

       /* int[] a = {9, 4, 2, 3, 2, 2, 6, 3, 3};
        int[] b = {a[0]};

        for (int i = 1; i < a.length; i++) {
            if (b.toString().indexOf(a[i]+"") == -1) {
               b[i] = a[i];
            }
        }
        System.out.println(b);*/
/*
        int[] a = {9, 4, 2, 3, 2, 2, 6, 3, 3};
        int[] b = new int[a.length];
        b[0] = a[0];

        for (int i = 0; i < a.length ; i++) {

            if (Arrays.toString(b).indexOf(a[i]+"") == -1) {
                b[i] = a[i];
            }
        }

        System.out.println(Arrays.toString(b));

        Map<String,String> channelTypeClearMap = new HashMap<>();*/

       /* String value = "DIRCON-105";
        int i = value.indexOf("-");
        String[] split = value.split("-");

        System.out.println(i);
        System.out.println(Arrays.toString(split));*/

        List<String> list  =   new  ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aba");
        list.add("aaa");

        new HashSet<>(list);
        List newList = new ArrayList(new HashSet(list));

        System.out.println( "去重后的集合： " + newList);
    }
}
