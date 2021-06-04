package com.JDBC;

import com.Dao.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetZiZeng {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DButil dbu = new DButil();
        Connection con = dbu.getConnection();
        String sql = "insert into account(name,login) values(?,?)";
        String[] col = {"id"};
        PreparedStatement ps = con.prepareStatement(sql,col);
        ps.setString(1,"zz");
        ps.setString(2,"qqq");
        int x = ps.executeUpdate();
        System.out.println(x);
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();
        String xx = rs.getString(1);//只能写1，指第一列
        System.out.println(xx);
        rs.close();
        ps.close();
        con.close();
    }
}
