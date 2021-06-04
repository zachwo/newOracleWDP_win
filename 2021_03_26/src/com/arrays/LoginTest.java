package com.arrays;

import java.awt.geom.FlatteningPathIterator;
import java.util.Arrays;
import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        //用户登录功能
        //输入用户名和密码，输入正确提示”欢迎您“；否则，提示：用户名或密码不正确
        String[] username = {"张三","李四","王五"};
        String[] passward = {"123","456","789"};

        System.out.println("请输入用户名和密码");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String pwd = scanner.next();
        boolean flag = false;

        for (int i = 0 ;i < username.length; i++ ){
            if (name.equals(username[i])){
                if (pwd.equals(passward[i])){
                    flag = true;
                }
            }
        }
        if (flag){
            System.out.println("登陆成功");
        }else {
            System.out.println("用户名或密码不正确");
        }

    }
}
