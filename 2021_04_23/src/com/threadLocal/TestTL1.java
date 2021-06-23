package com.threadLocal;

//ThreadLocal   为本地线程 创建一个局部的变量 用来保存当前线程中的值
//了解即可，基本和局部变量用法一样
public class TestTL1 extends Thread{
    ThreadLocal<String> tl1 = new ThreadLocal<>();

    @Override
    public void run() {
        tl1.set("abc");
        System.out.println(tl1.get());
    }
}
