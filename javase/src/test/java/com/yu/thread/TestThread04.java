package com.yu.thread;
//通过多线程操作同一个对象
//发现问题：多个线程操作一个数据时，数据紊乱
public class TestThread04 implements Runnable{
    private int tickets=10;
    @Override
    public void run() {
        while (true){
            if(tickets<=0){
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"第"+tickets--+"几张票");
        }
    }

    public static void main(String[] args) {
        //通过多线程操作同一个对象
        TestThread04 t4=new TestThread04();
        new Thread(t4,"小明").start();
        new Thread(t4,"tom").start();
        new Thread(t4,"李华").start();
    }
}
