package com;

import oop2.Dog;
import oop2.Pet;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.study("java");
        System.out.println(computer.brand+ ","+computer.size);

        //Java三大基石：封装、继承、多态
        //多态:父类的类型指向子类对象的引用
        //对象只能使用父类类型的方法，即"."出来的只能是父类的方法
        //如果父类的方法被子类重写，那么"."出来的方法是被子类重写后的方法
        //子类自己的方法无法被调用
        Pet dog = new Dog();
        dog.setName("旺财");//默认调用父类(Pet)的方法setName()
        System.out.println(dog.getName());
        dog.jiao();//如果子类重写了jiao()方法，则调用子类（Dog）的方法

    }
}
