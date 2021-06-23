package com.threadLocal;

public class Test {
    public static void main(String[] args) {
        TestTL1 t1 = new TestTL1();
        TestTL2 t2 = new TestTL2();

        ThreadLocal<String> tlMain = new ThreadLocal<>();
        tlMain.set("main");
        System.out.println(tlMain.get());

        t1.start();
        t2.start();
    }
}
