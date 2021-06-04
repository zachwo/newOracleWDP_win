package com.JDBC;

import com.Dao.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// jdbc 的事务处理
public class TestTransaction {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DButil dbu = new DButil();
        Connection con = dbu.getConnection();
        con.setAutoCommit(false); //事务的自动提交设为false

        double money = 30;
        String sql1 = "update account set money = money - ? where id = 1;";
        String sql2 = "update account set money = money + ? where id = 2;";
        try{
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setDouble(1,money);
            int x1 = ps1.executeUpdate();
            System.out.println(x1);
            if (money > 22){
                throw new Exception();
            }
            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setDouble(1,money);
            int x2 = ps2.executeUpdate();
            System.out.println(x2);
        }catch (Exception e){
            System.out.println("转账失败");
            con.rollback();
        }
        con.commit();
        dbu.closeAll();



    }
}
