package com.arrays;

import java.util.zip.Inflater;

public class CountNum {
    //统计数组中每个元素的个数
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,3,4};
        int num = 0; // 不相同元素的个数
        int[][] difarr = new int[arr.length][2];
        for (int i = 0 ;i<arr.length;i++){
            boolean flag = true;
            for (int j = 0 ; j < num ; j++){
                if (arr[i] == difarr[j][0]){
                    difarr[j][1]++;
                    flag = false;
                }
            }
            if (flag){
                difarr[num][0] = arr[i];
                difarr[num][1] = 1;
                num++;
            }
        }
        for (int i = 0 ; i<num ; i++){
            System.out.println(difarr[i][0]+"出现次数："+difarr[i][1]);
        }


    }
}
