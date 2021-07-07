package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Student stu = new Student();
        Class<Student> studentClass = (Class<Student>) Class.forName("com.reflect.Student");

        Method m = studentClass.getDeclaredMethod("sayHi");
        Method m1 = studentClass.getDeclaredMethod("sayHi", String.class);

        System.out.println(m.getName()+"/"+m.getModifiers()+"/"+m.getReturnType());
        System.out.println(Arrays.toString(m.getParameters())); //获取方法的参数列表
        System.out.println(m1.getName()+"/"+m1.getModifiers()+"/"+m1.getReturnType());
        System.out.println(Arrays.toString(m1.getParameters())); //获取方法的参数列表

        //调用方法
        m.invoke(stu);
        m1.invoke(stu,"张三");
    }
}
