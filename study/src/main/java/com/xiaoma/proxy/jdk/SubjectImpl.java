package com.xiaoma.proxy.jdk;

import java.util.Random;

/**
 * @Author: wangbingbing
 * @Date: 2017/7/28
 * @Time: 上午10:38
 * ---------------------------
 * @Desc: 描述
 */

public class SubjectImpl implements Subject {
    public int hello(String name) {
        int ranInt = new Random().nextInt(100);
        System.out.println("hello " + name + ", " + ranInt);
        return ranInt;
    }
}
