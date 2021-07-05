package com;

import java.sql.*;

//数据库工具类DBUtil
//要求会通过dbu完成dao的开发，实现"增删改查"功能
public class DButil {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    //获取连接的方法
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
        String user = "root";
        String pwd = "wz1999124";
        con = DriverManager.getConnection(url,user,pwd);
        return con;

    }

    //关闭方法
    public void closeAll(){
        try {
            if (con != null) {
                con.close();
            }
            if (ps != null){
                ps.close();
            }
            if (rs!= null){
                rs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //增删改: insert into xxx values(?,?,?)
    public int executeUpdate(String sql, Object ... param) throws SQLException, ClassNotFoundException {
        getConnection();
        ps = con.prepareStatement(sql);
        System.out.println(sql);
        for (int i = 0; i<param.length; i++){   //参数复制操作
            ps.setObject(i+1, param[i]);
            System.out.println(i+1+": "+param[i]);
        }
        int x = ps.executeUpdate();
        closeAll();
        return x;
    }

    //查询： select * from xxx where xxx
    public ResultSet executeQuery(String sql, Object ... param) throws SQLException, ClassNotFoundException {
        getConnection();
        ps = con.prepareStatement(sql);
        System.out.println(sql);
        for (int i = 0 ; i < param.length ; i++){
            ps.setObject(i+1,param[i]);
            System.out.println(i+1+": "+param[i]);
        }
        rs = ps.executeQuery();
        return rs;
    }

}
