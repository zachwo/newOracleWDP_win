package com.JDBC;

import com.Dao.AccountDao;
import com.Dao.AccountDao_DButil;
import com.pojo.Account;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestDao {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
        String user = "root";
        String password = "wz1999124";
        Connection connection = DriverManager.getConnection(url,user,password);

        AccountDao accountDao = new AccountDao();
        AccountDao_DButil ADDB = new AccountDao_DButil();
        Account account = new Account("一号","number01","010101",100);
        //增
        //System.out.println(ADDB.add(account)+ "行 受到了影响");
        //删
        //System.out.println(accountDao.delete(account)+ "行 受到了影响");
        //查
        //ArrayList<Account> list = ADDB.check();
        ArrayList<Account> list = ADDB.blurCheck("张","zh");
        for (int i = 0;i<list.size();i++)
            System.out.println(list.get(i).toString());

    }
}
