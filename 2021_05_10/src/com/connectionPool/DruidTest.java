package com.connectionPool;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidTest {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
        String user = "root";
        String pwd = "wz1999124";

        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName("com.mysql.jdbc.Driver");
        dds.setUrl(url);
        dds.setUsername(user);
        dds.setPassword(pwd);

        DruidPooledConnection dpc = dds.getConnection(); //名称有点区别，实际使用是一样的
        //...
        //PreparedStatement ps = dpc.prepareStatement(sql);
    }
}
