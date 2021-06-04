package com.task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //定义一个5个元素的数组，对齐赋值，再反向输出
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = arr.length-1 ; i >= 0 ; i--){
            System.out.println(arr[i]);
        }

        
    }
}
