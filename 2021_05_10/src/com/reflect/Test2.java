package com.reflect;

import java.lang.reflect.Field;

/**
 * 利用反射操作实现不使用setter/getter方法给类的private属性赋值/取值
 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Student stu = new Student();
        Class<Student> studentClass = (Class<Student>) Class.forName("com.reflect.Student");
        Field f = studentClass.getDeclaredField("sno");
        f.setAccessible(true); //private属性需要设置可访问性为true，否则会报错
        f.set(stu,123);
        //System.out.println(stu.getSno());

        //取值
        Object value = f.get(stu);
        System.out.println(value);
    }
}
