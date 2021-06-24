package com.JDBC;

import com.pojo.Account;

import java.sql.*;
import java.util.ArrayList;

/**
 * pojo & arraylist
 *  定义一个方法，用来查询 account2表中的所有数据信息
 *  将信息封装成 对象 放入到集合中 最后返回集合
 *  数据--》  对象 --》 ArrayList 集合中
 */
public class TestJdbc3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
        String user = "root";
        String password = "wz1999124";
        Connection connection = DriverManager.getConnection(url,user,password);

        ArrayList<Account> list = new ArrayList<>();
        String sql = "select * from account";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            Account account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setLogin(rs.getString("login"));
            account.setPwd(rs.getString("pwd"));
            account.setMoney(rs.getDouble("money"));
            list.add(account);
        }
        rs.close();
        ps.close();
        connection.close();
        for (int i = 0 ;i<list.size() ;i++){
            System.out.println(list.get(i).toString());
        }
    }
}
