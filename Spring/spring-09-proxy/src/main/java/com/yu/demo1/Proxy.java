package com.yu.demo1;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }
//
    @Override
    public void rent() {
    seeHouse();
        host.rent();
    fee();

    }
  //看房
  public void seeHouse(){
      System.out.println("看房");
  }
  //收费
    public void fee(){
        System.out.println("收中介费");
    }
}
