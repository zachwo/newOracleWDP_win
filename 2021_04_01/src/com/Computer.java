package com;

public class Computer {
    String size = "15-inch";
    String brand = "lenovo";

    public boolean play(String game){
        System.out.println("玩"+game);
        return true;
    }

    public void study(String subject){
        play("吃鸡");
        System.out.println("学"+subject);
    }
}
