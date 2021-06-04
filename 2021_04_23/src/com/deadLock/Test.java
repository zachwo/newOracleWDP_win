package com.deadLock;

public class Test extends Thread {
    A a = new A();
    B b = new B();
    @Override
    public void run() {
        System.out.println("执行了run方法");
        a.useB(b);
    }

    public void func(){
        System.out.println("执行了func方法");
        b.useA(a);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        t.func();
    }
}
