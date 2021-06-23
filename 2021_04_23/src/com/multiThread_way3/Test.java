package com.multiThread_way3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//实现多线程的第三种方式：实现Callable接口 重写 call方法
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MultiThread3 mt = new MultiThread3();

        // 线程池：内有常驻线程，随用随取，用完放回而不是直接销毁，省去了频繁创建线程的开销
        // 构建了一个可用的线程池，并在线程池里创建了五个线程
        ExecutorService es = Executors.newFixedThreadPool(5);
        Future<String> f = es.submit(mt);   //submit相当于start方法
        // Submits a Runnable task for execution and returns a Future representing that task.
        // Future 表示异步计算的结果。它提供了检查计算是否完成的方法，以等待计算的完成，并获取计算的结果。
        // 计算完成后只能使用 get 方法来获取结果，如有必要，计算完成前可以阻塞此方法。
        // 取消则由 cancel 方法来执行。还提供了其他方法，以确定任务是正常完成还是被取消了。
        // 一旦计算完成，就不能再取消计算。

        System.out.println(f.isDone()); // 获取线程是否完成
        System.out.println("xxxx");
        System.out.println(f.get());
        //get()相当于调用了join方法强行插入mt线程，并等待线程计算完成，获取其返回结果。
        //利用call()方法的返回值，可以在我的线程里面监控对方的线程，对方线程什么时候完事了，call()方法就会发送一个返回值表示"我完事了"
        System.out.println(f.isDone());
        System.out.println("qqqq");
    }
}
