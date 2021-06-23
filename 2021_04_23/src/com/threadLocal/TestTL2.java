package com.threadLocal;

public class TestTL2 extends Thread{
    ThreadLocal<String> tl2 = new ThreadLocal<>();

    @Override
    public void run() {
        tl2.set("123");
        System.out.println(tl2.get());
    }
}
