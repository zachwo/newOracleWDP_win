package com.implement;

public interface Ipad {
    //接口属性是静态常量，不可修改
    static final String brand = "Apple Inc.";

    public void play();
    //完整写法应该是 public abstract void play();
    //但是约定俗成写接口方法的时候省略掉abstract

    public void music();

}
