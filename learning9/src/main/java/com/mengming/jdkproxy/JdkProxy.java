package com.mengming.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理类
public class JdkProxy implements InvocationHandler {

    //目标角色
    private Object target;

    //通过带参构造来传递目标角色
    public JdkProxy(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        //得到类加载器
        ClassLoader classLoader = this.getClass().getClassLoader();
        //得到目标对象实现的接口
        Class<?>[] interfaces = target.getClass().getInterfaces();
        //一个接口
//        InvocationHandler invocationHandler = new InvocationHandler() {
//            /**
//             * 当代理实例中对应的方法调用时，invoke方法就会执行一次
//             * @param proxy
//             * @param method
//             * @param args
//             * @return
//             * @throws Throwable
//             */
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        };
        //得到代理对象（代理实例）
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, this);
        //返回代理
        return proxy;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //System.out.println("invoke...");
        Object ret = method.invoke(this.target, args);

        //目标方法的返回值
        return ret;
    }
}
