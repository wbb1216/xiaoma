package com.xiaoma.proxy.jdk;

        import java.lang.reflect.InvocationHandler;
        import java.lang.reflect.Proxy;

/**
 * @Author: wangbingbing
 * @Date: 2017/7/28
 * @Time: 上午10:49
 * ---------------------------
 * @Desc: 描述
 */

public class Client {

    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        InvocationHandler invocationHandler = new SubjectProxy(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), invocationHandler);
        System.out.println(proxy.hello("xiaoma"));
    }
}
