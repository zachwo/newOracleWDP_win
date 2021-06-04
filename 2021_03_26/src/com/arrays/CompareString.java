package com.arrays;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.equals("aaa"));
        System.out.println(str.equals("abc"));
        //接收用户输入的字符串

        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();
        System.out.println(user.equals("admin"));

        //判断用户输入的字符串是否是"admin"



    }
}
