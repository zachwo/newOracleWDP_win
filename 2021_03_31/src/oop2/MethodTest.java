package oop2;

public class MethodTest {
    //构造方法之间的调用:
    //需要通过this();且只能放在构造方法的第一行
    public MethodTest(){
        sum(1,2);
        System.out.println("无参数构造方法");
    }
    public MethodTest(int a){
        this();
        System.out.println("int 构造方法");
    }
    public MethodTest(int a,int b){
        this(1);
        System.out.println("int int构造方法");
    }

    public void sum(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodTest mt = new MethodTest(2,3);
    }
}




















