package com.deadLock;

public class A {
    public synchronized void useB(B b){
        System.out.println("执行了A类的useB方法");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.funcB();
    }

    public synchronized void funcA(){
        System.out.println("执行了A类的funcA方法");
    }
}
