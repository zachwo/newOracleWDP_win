package com.autoIncrease;

import com.Dao.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GeneralKeysTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DButil dbu = new DButil();
        Connection con = dbu.getConnection();

        String sql = "insert into account2(name ,login) values(?,?)";
        String[] col = {"id"};  //要返回的数据列的名称
        PreparedStatement ps = con.prepareStatement(sql,col);
        ps.setString(1,"zhangsan");
        ps.setString(2,"zhang123");
        int x = ps.executeUpdate();
        System.out.println(x);

        /**
         * Statement.getGeneratedKeys() 方法获取由于执行此 Statement 对象而创建的所有自动生成的键。
         * 如果此 Statement 对象没有生成任何键，则返回空的 ResultSet 对象。
         */
        ResultSet rs = ps.getGeneratedKeys();//通过此方法获取新插入的元素的id列的值，存放到resultset里
        rs.next(); //使用rs.getXXX()之前，一定要加rs.next();
        /**
         * 原因：ResultSet对象代表SQL语句执行的结果集，维护指向其当前数据行的光标。
         * 一开始，光标的位置在第一行的前面。每调用一次next()方法，光标向下移动一行。
         * 最初它位于第一行之前，因此第一次调用next()应把光标置于第一行上，使它成为当前行。
         * 随着每次调用next()将导致光标向下移动一行。
         * 在ResultSet对象及其它父辈Statement对象关闭之前，光标一直保持有效。
         */
        String newid = rs.getString(1); //获取数据集第一行第一列的数据
        System.out.println(newid);

        rs.close();
        ps.close();
        con.close();

    }
}
