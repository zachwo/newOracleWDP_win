package oop2;
//继承练习
//类是单继承，接口是多实现
public class ExtendsTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(2);
        cat.setName("mimi");
        cat.setType("英短");
        cat.jiao();

        Dog dog = new Dog();
        dog.setAge(3);
        dog.setName("wangcai");
        dog.setType("husky");
        dog.jiao();

        cat.maimeng();


    }
}
