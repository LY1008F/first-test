package com.yu.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//标注这个类为一个切面
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.yu.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("--执行前--");
    }
    @After("execution(* com.yu.service.UserServiceImpl.*(..))")
    public  void after(){
        System.out.println("--执行后--");
    }
}
