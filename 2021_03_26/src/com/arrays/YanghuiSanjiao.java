package com.arrays;

import java.util.Scanner;

/**
 * 输出10行杨辉三角
 */
public class YanghuiSanjiao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入杨辉三角行数：");
        int length = scanner.nextInt();
        while (length>0){
            int[][] array = new int[length+1][length+1];
            for (int i = 1 ; i<=length ; i++ ){
                array[i][1] = array[i][i] = 1;
            }

            for (int i = 1 ;i<=length;i++){
                for (int j = 2 ; j<=i-1 ; j++){
                    array[i][j] = array[i-1][j-1]+array[i-1][j];
                }
            }

            for (int i = 1 ;i<=length ;i++){
                for (int j = 1; j <= i ;j ++){
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }

            length = scanner.nextInt();
        }


    }
}
