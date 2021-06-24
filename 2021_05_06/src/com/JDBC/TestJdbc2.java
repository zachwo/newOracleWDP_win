package com.JDBC;

import com.pojo.Account;
import java.sql.*;
import java.util.Scanner;

//PreparedStatement的用法：避免SQL注入问题
public class TestJdbc2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
        String user = "root";
        String password = "wz1999124";
        Connection connection = DriverManager.getConnection(url,user,password);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名和密码：");
        String login = scanner.next();
        String pwd = scanner.next();
        String sql = "select * from account where login = ? and pwd = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,login);
        ps.setString(2,pwd);
        ResultSet rs = ps.executeQuery();
        boolean flag = false;
        Account account = null;
        while (rs.next()){  //只有sql语句匹配上了才会执行while循环
            flag = true;
            account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setLogin(rs.getString("login"));
            account.setPwd(rs.getString("pwd"));
            account.setMoney(rs.getDouble("money"));
        }
        if (flag){
            System.out.println("登陆成功：");
            System.out.println(account.toString());
        }else {
            System.out.println("用户名或密码错误！");
        }
        rs.close();
        ps.close();
        connection.close();
    }
}
