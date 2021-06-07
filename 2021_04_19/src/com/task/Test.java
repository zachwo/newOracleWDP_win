package com.task;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 编写一个扑克类（每张扑克有花色和数值，例如红心A，草花10）将52张扑克牌(没有大小王)放到集合中（自己去选择集合类）
 * 编写3个方法：
 * 方法一：将集合中的所有扑克重新洗牌，并将扑克输出（打印出来即可）
 * 方法二：将集合中的所有扑克排序（按照方块3～2，草花3～2，红心3～2，黑桃3～2的顺序排序）
 * 方法三：比较两张扑克牌的大小，如果版面的值相等，则按照（黑桃->红心->草花->方块）的顺序进行排序
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Poker> pokers = new ArrayList<>();
        String[] color = {"方块♦️","草花♣️","红心♥️","黑桃♠️"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (int i = 0 ; i< 52 ; i++){
            Poker p = new Poker(color[i/13],number[i%13]);
            pokers.add(p);
        }
        System.out.println("---------原始扑克牌-----------—-");
        for (Poker p:pokers){
            System.out.println(p);
        }
        System.out.println("---------洗牌------------");
        Test.shuffleCard(pokers);
        for (Poker p:pokers){
            System.out.println(p);
        }
        System.out.println("---------排序------------");
        Test.sortCard(pokers);
        for (Poker p:pokers){
            System.out.println(p);
        }
        System.out.println("---------比较------------");
        Poker p1 = new Poker("方块♦️","3");
        Poker p2 = new Poker("红心♥️","3");
        Test.compareCard(p1,p2);
        Test.compareCard(pokers.get((int) (Math.random() * 52)),pokers.get((int) (Math.random() * 52)));
    }

    //方法一：将集合中的所有扑克重新洗牌，并将扑克输出（打印出来即可）
    public static void shuffleCard(ArrayList<Poker> pokers){
        for (int i = 0 ; i<5000 ; i++) {
            //随机交换
            Collections.swap(pokers, (int) (Math.random() * 52), (int) (Math.random() * 52));
        }
    }

    //方法二：
    //排序思路：对3、4、5、6、7、8、9、10、J、Q、K、A、2赋予权值：1～13
    //排序思路：对方块、草花、红心、黑桃也同样赋予权制：0，100，200，300（权值设定只要花色加上数值没有重复的就行）
    public static void sortCard(ArrayList<Poker> pokers){
        SortCard sc = new SortCard();
        Collections.sort(pokers,sc);
    }

    //方法三：比较两张扑克牌的大小，如果版面的值相等，则按照（黑桃->红心->草花->方块）的顺序进行排序
    public static void compareCard(Poker p1,Poker p2){
        if (p1.number_weight != p2.number_weight){
            System.out.println(p1.number_weight>p2.number_weight ? p1+"\n"+p2 : p2+"\n"+p1);
        }else {
            System.out.println(p1.color_weight>p2.color_weight ? p1+"\n"+p2 : p2+"\n"+p1);
        }
    }
}
