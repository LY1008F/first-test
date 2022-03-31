package com.yu.thread;

public class TestThread03 implements Runnable{
    @Override
    public void run() {
        //run()方法线程体
        for(int i=0;i<10;i++){
            System.out.println("run线程"+i);
        }
    }

    public static void main(String[] args) {

        TestThread03 testThread03=new TestThread03();
        new Thread(testThread03).start();
        for(int i=0;i<10;i++){
            System.out.println("主线程"+i);
        }
    }
}
