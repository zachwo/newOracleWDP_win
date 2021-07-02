package com.transaction;

import com.Dao.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// jdbc 的事务处理
/**
 * 数据库事务：Database Transaction，满足ACID属性
 * 数据库事务( transaction)是访问并可能操作各种数据项的一个数据库操作序列，
 * 这些操作要么全部执行,要么全部不执行，是一个不可分割的工作单位。
 * 事务由事务开始与事务结束之间执行的全部数据库操作组成。
 */
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
