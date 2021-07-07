package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //获取运行时类
        Class<Student> studentClass = (Class<Student>) Class.forName("com.reflect.Student");
//        Class<Student> studentClass1 = Student.class;
//        Class<Student> studentClass2 = (Class<Student>) new Student().getClass();

        //构造方法的处理：
        //利用反射创建类的实例(只能调用无参构造方法)
        Student stu = studentClass.newInstance();
        //获取类的所有构造方法：
        Constructor[] constructors = studentClass.getDeclaredConstructors();
        //获取具体构造方法：
        Constructor<Student> cs = studentClass.getDeclaredConstructor(String.class);
        Student stu1 = cs.newInstance("张三");//可以使用有参构造方法


    }
}
