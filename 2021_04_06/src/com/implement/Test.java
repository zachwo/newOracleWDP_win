package com.implement;

import java.sql.SQLOutput;

/**
 * 接口练习
 * 定义关键字： interface
 * 接口是一种特殊的抽象类，接口的方法都是共有的抽象方法，属性都是共有的静态常量（即属性用final static修饰）
 * 接口更像是一种协议规范，用来限定子类的行为模式
 * 接口的实现（本质也是一种继承）使用implements语句（区别于继承的extends）
 *
 * 同种的（eg类与类，接口与接口）叫做继承
 * 不同种的（eg类与接口）叫做实现
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Ipad.brand);
        Ipad ipad = new IpadPro();
        ipad.music();
        ipad.play();
        IpadPro ipadPro = new IpadPro();
        ipadPro.music();
        ipadPro.play();
    }
}
