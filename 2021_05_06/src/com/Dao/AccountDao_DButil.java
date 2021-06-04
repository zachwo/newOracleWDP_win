package com.Dao;

import com.pojo.Account;

import java.sql.*;
import java.util.ArrayList;

public class AccountDao_DButil {
    //增
    public int add(Account account) throws ClassNotFoundException, SQLException {
        DButil dButil = new DButil();
        Connection connection = dButil.getConnection();

        String sql = "insert into account(id,name, login, pwd, money) values(default,?,?,?,?)";
        int x = dButil.executeUpdate(sql,account.getName(),account.getLogin(),account.getPwd(),account.getMoney());

        dButil.closeAll();
        return(x);
    }
    //删
    public int delete(Account account) throws ClassNotFoundException, SQLException {
        DButil dButil = new DButil();
        Connection connection = dButil.getConnection();

        String sql = "delete from account where id=?";
        int x = dButil.executeUpdate(sql,account.getId());

        dButil.closeAll();
        return(x);
    }
    //改
    public int alter(Account account) throws ClassNotFoundException, SQLException {
        DButil dButil = new DButil();
        Connection connection = dButil.getConnection();

        String sql ="update account set name = ?,pwd = ?,money = ? where login = ?";
        int x = dButil.executeUpdate(sql,account.getName(),account.getPwd(),account.getMoney(),account.getLogin());

        dButil.closeAll();
        return(x);
    }
    //查
    public ArrayList<Account> check() throws ClassNotFoundException, SQLException {
        DButil dButil = new DButil();
        Connection connection = dButil.getConnection();

        String sql = "select * from account";
        ResultSet rs = dButil.executeQuery(sql);

        ArrayList<Account> list = new ArrayList<>();
        while (rs.next()){
            Account account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setLogin(rs.getString("login"));
            account.setPwd(rs.getString("pwd"));
            account.setMoney(rs.getDouble("money"));
            list.add(account);
        }

        dButil.closeAll();
        return list;
    }

    //模糊+组合查询
    public ArrayList<Account> blurCheck(String name, String login) throws SQLException, ClassNotFoundException {
        String sql = "select * from account where 1=1";
        ArrayList params = new ArrayList<>();
        if (name != null){
            sql += " and name like ?";
            params.add("%"+name+"%");
        }
        if (login != null){
            sql += " and login like ?";
            params.add("%"+login+"%");
        }

        DButil dButil = new DButil();
        ResultSet rs = dButil.executeQuery(sql,params.toArray()); // 一定要记得toArray()!!!

        ArrayList<Account> list = new ArrayList<>();
        while (rs.next()){
            Account account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setLogin(rs.getString("login"));
            account.setPwd(rs.getString("pwd"));
            account.setMoney(rs.getDouble("money"));
            list.add(account);
        }

        dButil.closeAll();
        return list;

    }

}
