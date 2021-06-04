package com.Dao;

import com.pojo.Account;

import java.sql.*;
import java.util.ArrayList;

/**
 * DAO:data access object数据访问对象（MVC三层结构之一）
 * dao实现对数据库的增删改查方法
 */
public class AccountDao {
    //增
    public int add(Account account) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
        String user = "root";
        String password = "wz1999124";
        Connection connection = DriverManager.getConnection(url,user,password);

        String sql = "insert into account(id,name, login, pwd, money) values(default,?,?,?,?)";
        PreparedStatement ps =  connection.prepareStatement(sql);
        ps.setString(1,account.getName());
        ps.setString(2,account.getLogin());
        ps.setString(3,account.getPwd());
        ps.setDouble(4,account.getMoney());
        int x = ps.executeUpdate();
        connection.close();
        ps.close();
        return(x);
    }
    //删
    public int delete(Account account) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
        String user = "root";
        String password = "wz1999124";
        Connection connection = DriverManager.getConnection(url,user,password);

        String sql = "delete from account where id=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,account.getId());

        int x = ps.executeUpdate();
        connection.close();
        ps.close();
        return(x);
    }
    //改
    public int alter(Account account) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
        String user = "root";
        String password = "wz1999124";
        Connection connection = DriverManager.getConnection(url,user,password);

        String sql ="update account set name = ?,pwd = ?,money = ? where login = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,account.getName());
        ps.setString(2,account.getPwd());
        ps.setDouble(3,account.getMoney());
        ps.setString(4,account.getLogin());
        return ps.executeUpdate();
    }
    //查
    public ArrayList<Account> check() throws ClassNotFoundException, SQLException {
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

        return list;

    }
}
