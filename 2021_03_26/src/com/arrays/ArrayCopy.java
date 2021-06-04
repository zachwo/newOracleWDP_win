package com.arrays;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = Arrays.toString(arr);
        System.out.println(str);

        //数组的两种复制方式
        //方法一：Arrays.copyOf(原数组，newLength)-->将原数组复制到长度为newlength的新数组当中
        int[] arr1 = Arrays.copyOf(arr,2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);

        int[] arr2 = Arrays.copyOf(arr,6);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.length);

        //方法二:System.arraycopy(src, srcPos, dest, destPos, length)
        //将原数组src从srcPos索引位置开始复制length长度到目标数组dest的destPos索引位置
        //如果目标数组的长度不够会报错
        int[] src = {1,2,3,4,5,6,7,8,9,10};
        int[] dest = new int[6];
        System.arraycopy(src,3,dest, 0, 6);
        System.out.println(Arrays.toString(dest));



    }
}
