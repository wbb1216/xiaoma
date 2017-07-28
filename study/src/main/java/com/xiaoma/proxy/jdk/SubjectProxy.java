package com.xiaoma.proxy.jdk;

        import java.lang.reflect.InvocationHandler;
        import java.lang.reflect.Method;

/**
 * @Author: wangbingbing
 * @Date: 2017/7/28
 * @Time: 上午10:40
 * ---------------------------
 * @Desc: 描述
 */

public class SubjectProxy implements InvocationHandler {
    private Object target;

    public SubjectProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(" before calling " + method);
        Object result = method.invoke(target, args);
        System.out.println(" after calling " + method);
        return result;
    }
}
