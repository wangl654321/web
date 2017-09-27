package com.wang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017/9/2721:02
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
public class TestNumS {
    public static void main(String[] args) {
        int[] num = new int[]{8, 6, 3, 4, 5, 4, 2, 3, 3, 3, 2, 4};
        int[] ben = {};
       /* HashSet set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            int index = num[i];
            set.add(index);
        }
        System.out.println(set.toString());*/


        //数组去重方法二
        String[] array = {"a", "b", "c", "c", "d", "e", "e", "e", "a"};
        List<String> list = new ArrayList<>();
        list.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (list.toString().indexOf(array[i]) == -1) {
                list.add(array[i]);
            }
        }
        System.out.println(list);
    }
}
