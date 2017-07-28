package com.xiaoma.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: wangbingbing
 * @Date: 2017/7/28
 * @Time: 上午11:15
 * ---------------------------
 * @Desc: 描述
 */

public class SubjectProxy implements MethodInterceptor {
    private Object target;

    /**
     * 创建代理对象
     *
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        // 回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始");
        methodProxy.invokeSuper(o, objects);
        System.out.println("结束");
        return null;
    }
}
