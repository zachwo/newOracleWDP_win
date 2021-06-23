package com.multiThread_way3;

import java.util.concurrent.Callable;

/**实现多线程的第三种方式：实现Callable接口 重写 call方法
 */
public class MultiThread3 implements Callable<String> {

    /**
     * call()方法的返回值与Callable的范型有关
     * @return
     * @throws Exception
     */
    @Override
    public String call() throws Exception {
        for (int i = 1 ; i<= 100 ;i++){
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"米");
        }
        return "跑完了";
    }
}
