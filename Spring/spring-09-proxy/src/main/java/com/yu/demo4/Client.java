package com.yu.demo4;

public class Client {
    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService=new UserServiceImpl();
        //代理对象
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setObject(userService);//设置要代理的对象
        //动态生成代理类
        UserService userService1 = (UserService) pih.getProxy();
        userService1.add();
    }
}
