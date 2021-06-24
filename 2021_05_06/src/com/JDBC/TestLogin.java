package com.JDBC;

import com.sun.jdi.event.StepEvent;

import java.sql.*;
import java.util.Scanner;

public class TestLogin {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {




        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
        String user = "root";
        String password = "wz1999124";
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        //1、通过jdbc创建一个表account: id name login pwd money,其中id自增
//        String sql1 = "CREATE TABLE account(\n" +
//                "id INT PRIMARY KEY auto_increment,\n" +
//                "name VARCHAR(20),\n" +
//                "login VARCHAR(20),\n" +
//                "pwd VARCHAR(20),\n" +
//                "money DOUBLE\n" +
//                ");";
//        System.out.println(sql1); // 用于debug
//        int x1 = statement.executeUpdate(sql1);
//        System.out.println(x1);

        //2、通过jdbc的方式从控制台接收： 用户名 登录名 密码 余额 并插入到数据库表中
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        String login = scanner.next();
//        String pwd = scanner.next();
//        double money = scanner.nextDouble();
//        while (true){
//            String sql2 = "INSERT INTO account(id,name, login, pwd, money)" +
//                    " VALUES(null,'" + name+"','"+login+"','"+pwd+"',"+money+");";
//            int x2 = statement.executeUpdate(sql2);
//            System.out.println(x2+"行 受到了影响");
//
//            name = scanner.next();
//            if (name.equals("end")) {
//                break;
//            }
//            login = scanner.next();
//            pwd = scanner.next();
//            money = scanner.nextDouble();
//        }

        //3、完成登录功能（让用户输入用户名和密码）
        for (int i = 3;i>0;i--){
            Scanner scanner = new Scanner(System.in);
            System.out.println("欢迎登陆，请输入账户名和密码：");
            String login = scanner.next();
            String pwd = scanner.next();
            boolean flag = false;

            String sql3 = "select * from account;";
            ResultSet rs = statement.executeQuery(sql3);
            while (rs.next()){
                String correctLogin = rs.getString("login");
                String correctPwd = rs.getString("pwd");

                if (!login.equals(correctLogin)){
                    continue;
                }else if (pwd.equals(correctPwd)){
                    flag = true;
                    System.out.println("登陆成功，以下为您的账户信息：");
                    System.out.println(
                            "户主姓名：\t"+rs.getString("name")+"\n"+
                                    "账户余额：\t"+ rs.getDouble("money"));
                    break;
                }
            }
            if (flag==false){
                System.out.println("用户名或密码错误，今日还可尝试"+(i-1)+"次");
            }else {
                break;
            }
        }
        statement.close();
        connection.close();

    }
}
