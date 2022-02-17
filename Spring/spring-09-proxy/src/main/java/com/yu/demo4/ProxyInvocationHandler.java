package com.yu.demo4;

import com.yu.demo3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    //生成代理类
    public  Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),object.getClass().getInterfaces(),this);

    }
//处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
