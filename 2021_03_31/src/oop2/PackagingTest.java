package oop2;
// 封装练习
// 封装:将属性私有化，提供公有的get与set方法
public class PackagingTest {
    private int age = 22;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){ //获取值的内容
        return age;
    }
    public void setAge(int age){ //设置值
        this.age = age;
    }
}
