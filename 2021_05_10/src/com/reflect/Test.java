package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //获取当前类的运行时类：（ps.运行时类即加载到内存中的类; 当前类与运行时类必须在同一个项目里）
        //Class类的一个实例对应加载到内存中的一个运行时类，Class类会存储对应Student类的完整结构内容
        Class<Student> stu = (Class<Student>) Class.forName("com.reflect.Student");

        //获取运行时类的完整路径
        String name = stu.getName();
        System.out.println(name);
        System.out.println("------------------------------------");

        //获取该类的所有属性列表
        Field[] fields = stu.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f.getName());//获取属性名
        }
        System.out.println("------------------------------------");

        //获取该类的所有方法列表
        Method[] methods = stu.getDeclaredMethods();
        for (Method m:methods){
            System.out.println(m.getName());//获取方法名
        }
        System.out.println("------------------------------------");

        //获取访问修饰符类型：（以属性为例）
        //以整数形式返回由此 Field 对象表示的字段的 Java 语言修饰符
        //多个修饰符修饰的返回叠加整数值
        //数值对应表详见java.lang.reflect.Modifier-ABSTRACT-常量字段值
        for (Field f:fields){
            System.out.println(f.getName()+": "+f.getModifiers());//获取属性名
        }
        System.out.println("------------------------------------");

        //获取属性类型
        for (Field f:fields){
            System.out.println(f.getName()+": "+f.getType());//获取完整类型
            System.out.println(f.getName()+": "+f.getType().getSimpleName());//获取简单名
        }
        System.out.println("------------------------------------");

        //单个属性操作（前提是知道该属性信息）
        Field f1 = stu.getDeclaredField("sno");
        System.out.println(f1.getName()+"\t"+f1.getType()+"\t"+f1.getModifiers());

    }
}
