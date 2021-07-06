package com.connectionPool;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Test {
    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
        String user = "root";
        String pwd = "wz1999124";
        cpds.setJdbcUrl(url);
        cpds.setUser(user);
        cpds.setPassword(pwd);
        //初始池内创建两个连接，可根据需要扩增连接数，最大为五个，当一些连接长时间空闲，则销毁，但销毁后的连接数要大于等于2
        cpds.setMaxPoolSize(5); //连接池最大保有5个连接
        cpds.setMinPoolSize(2); //最少保有2两个连接
        cpds.setMaxIdleTime(1000);//连接的最大空闲时间（连接长时间闲置则销毁，只保有最小连接数）
        Connection con = cpds.getConnection(); //从连接池内获取的连接对象在使用上和普通连接对象没有任何差别
        // ...



    }
}
