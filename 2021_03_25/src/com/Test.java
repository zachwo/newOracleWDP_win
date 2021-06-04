package com;

public class Test {
    public static void main(String[] args) {
        //数组Array
        int[] ages = new int[4];
        for (int i = 0;i<ages.length;i++){
            ages[i] = 18+i;
        }
        for (int i = 0;i<ages.length;i++){
            System.out.println(ages[i]);
        }
    }
}
