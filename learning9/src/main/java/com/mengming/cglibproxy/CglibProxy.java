package com.mengming.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLTB功态代理理
 * 采用是继承思想，生成一个子类继承目标对象。（月标类不能用final终饰）
 */
public class CglibProxy {
    //目标对象
    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        //得到Enhancer对象，通过调用Enhancer的create()方法，生成一个类（代理对象）
        Enhancer enhancer = new Enhancer();
        //设置父类（将目标对象设置为当前生成类的父类）
        enhancer.setSuperclass(target.getClass());
        //获取拦截器
        MethodInterceptor interceptor = new MethodInterceptor() {
            /**
             * 拦截器
             * 1.目标对象的方法调用
             * 2.增强行为
             *
             * 每当代理实例中的方法被调用时，intercept方法就会执方法
             * @param obj         由CGLib动态生成的代理类实例
             * @param method      实体类所调用的被代理的方法引用
             * @param objects     参数值列表
             * @param methodProxy 生成的代理类对方法的代理引用
             * @return
             * @throws Throwable
             */
            public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object ret = methodProxy.invoke(target, objects);
                return ret;
            }
        };
        //设置拦截器
        enhancer.setCallback(interceptor);
        return enhancer.create();
    }


//    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        Object ret = methodProxy.invoke(this.target, objects);
//        return ret;
//    }

}
