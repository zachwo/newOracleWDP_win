package com.deadLock;

public class B {

    public synchronized void useA(A a){
        System.out.println("执行了B类的useA方法");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.funcA();
    }
    public synchronized void funcB(){
        System.out.println("执行了B类的FuncB方法");
    }
}
