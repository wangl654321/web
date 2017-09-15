package com.wang;

import org.junit.Test;

import java.util.function.Function;
import java.util.stream.Stream;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-08-2515:05
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
public class TestLambda {



    public static void main(String[] args){
        Function<User,String> name = p ->{
            return p.getName();
        };
        String aa = name.apply(new User("1","2","3"));
        System.out.println(aa);
    }

    @Test
    public void reduceTest() {
        int sumAll = Stream.of(1, 2, 3, 4).reduce(0,Integer::sum);//  Integer在Java8中提供了sum求和静态方法。
        System.out.println(sumAll);// 10
    }

}
