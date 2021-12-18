package com.mengming.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 定义切面（通过注解的方式）
 * 设置注解：@Aspect
 * 由切入点与通知的结合
 * 定义切入点 Pointcut
 * 规定需要拦截哪些方法，哪些方法需要被处理
 *
 * @PointCut("匹配规则) 定义通知
 * 前置通知@Before
 * 返回通知@AfterReturning
 * 异常通知@AfterThrowing
 * 最终通知@After
 * 环绕通知@Around
 */
@Component //将对象交给IOC容器维护
@Aspect //表示当前是一个切面类
public class LogCut2 {

    public void cut() {

    }

    public void before() {
        System.out.println("前置通知...方法执行前执行的通知");
    }

    public void afterReturning() {
        System.out.println("返回通知...方法正常执行完执行的通知");
    }

    public void after() {
        System.out.println("最终通知...方法执行结束后执行的通知");
    }

    public void afterThrowing(Exception e) {
        System.out.println("异常通知...异常原因" + e.getMessage());
    }

    public Object around(ProceedingJoinPoint pjp){
        System.out.println("环绕通知-前置通知...");
        Object object = null;

        try {
            object = pjp.proceed();
            System.out.println("环绕通知-返回通知...");
        } catch (Throwable throwable) {
            System.out.println("环绕通知-异常通知..");
            throwable.printStackTrace();
        }
        System.out.println("环绕通知-最终通知...");
        return object;
    }
}
