package com.task;

import java.io.PipedReader;
import java.security.PrivateKey;
import java.util.ArrayList;

/**
 * 编写一个扑克类（每张扑克有花色和数值，例如红心A，草花10）将52张扑克牌放到集合中（自己去选择集合类）
 * 编写3个方法：
 * 方法一：将集合中的所有扑克重新洗牌，并将扑克输出（打印出来即可）
 * 方法二：将集合中的所有扑克排序（按照方块3～2，草花3～2，红心3～2，黑桃3～2的顺序排序）
 * 方法三：比较两张扑克牌的大小，如果版面的值相等，则按照（黑桃->红心->草花->方块）的顺序进行排序
 */
public class Poker {
    String color;   //花色
    String number;  //数值
    int color_weight;  //花色权值
    int number_weight;  //数值权值
    int weight;
    //方法二：
    //排序思路：对3、4、5、6、7、8、9、10、J、Q、K、A、2赋予权值：1～13
    //排序思路：对方块、草花、红心、黑桃也同样赋予权制：0，100，200，300（权值设定只要花色加上数值没有重复的就行）
    public Poker(String color, String number) {
        this.color = color;
        this.number = number;
        switch (color){
            case "方块♦️": color_weight+=0;break;
            case "草花♣️": color_weight+=100;break;
            case "红心♥️": color_weight+=200;break;
            case "黑桃♠️": color_weight+=300;break;
            default:
        }
        switch (number){
            case "3": number_weight+=1;break;
            case "4": number_weight+=2;break;
            case "5": number_weight+=3;break;
            case "6": number_weight+=4;break;
            case "7": number_weight+=5;break;
            case "8": number_weight+=6;break;
            case "9": number_weight+=7;break;
            case "10": number_weight+=8;break;
            case "J": number_weight+=9;break;
            case "Q": number_weight+=10;break;
            case "K": number_weight+=11;break;
            case "A": number_weight+=12;break;
            case "2": number_weight+=13;break;
            default:
        }
        weight = color_weight+number_weight;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "color='" + color + '\'' +
                ", number='" + number + '\'' +
                ", color_weight=" + color_weight +
                ", number_weight=" + number_weight +
                ", weight=" + weight +
                '}';
    }
}
