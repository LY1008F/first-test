package com.yu.thread;
//创建线程方式1：继承run（）方法，调用start开启线程
//线程调度主要由cpu调度
public class TestThread  extends Thread{
    @Override
    public void run() {
        //run()方法线程体
        for(int i=0;i<100;i++){
            System.out.println("run线程"+i);
        }
    }

    public static void main(String[] args) {
        //main主线程
        TestThread thread=new TestThread();
        //调用start（）方法开启线程
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("主线程"+i);
        }
    }
}
