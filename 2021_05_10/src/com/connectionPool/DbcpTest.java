package com.connectionPool;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DbcpTest {
    public static void main(String[] args) throws SQLException {
        BasicDataSource bds = new BasicDataSource();
        bds.setDriverClassName("com.mysql.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
//        String user = "root";
//        String pwd = "wz1999124";
        bds.setUrl("jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8");
        bds.setUsername("root");
        bds.setPassword("root");
        bds.setMaxActive(5);
        bds.setInitialSize(2);
        Connection con = bds.getConnection();
    }
}
