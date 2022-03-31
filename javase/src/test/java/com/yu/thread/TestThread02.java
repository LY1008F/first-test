package com.yu.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThread02 extends  Thread{
    private String url;
    private String name;
    public TestThread02(String url,String name){
        this.url=url;
        this.name=name;
    }
    @Override
    public void run() {
        D d=new D();
        d.d(url,name);
    }

    class D{
        public void d(String url,String name){
            try {
                FileUtils.copyURLToFile(new URL(url),new File(name));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
