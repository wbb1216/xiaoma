package com.xiaoma.proxy.cglib;

/**
 * @Author: wangbingbing
 * @Date: 2017/7/28
 * @Time: 下午1:53
 * ---------------------------
 * @Desc: 描述
 */

public class Client {

    public static void main(String[] args) {
        SubjectProxy cglib = new SubjectProxy();
        SubjectImpl subject = (SubjectImpl) cglib.getInstance(new SubjectImpl());
        subject.hello("xiaoma");
    }
}
