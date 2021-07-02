package com.batch;

import com.Dao.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务批量插入
 */
public class TestBatch {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        long start = System.currentTimeMillis();

        DButil dbu = new DButil();
        Connection con = dbu.getConnection();
        con.setAutoCommit(false);
        String sql = "insert into account(name,login) values(?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        int i = 0;
        while (i++ < 10000){
            ps.setString(1,"name"+i);
            ps.setString(2,"login"+i);
            ps.addBatch();  //添加指令集
//            批量处理优化：每500条指令批处理一次
//            if (i%500 == 0){
//               ps.executeBatch(); //执行批处理
//               ps.clearBatch();   //清空已执行过的批指令
//            }
        }
        ps.executeBatch(); // 执行批处理
        con.commit();
        dbu.closeAll();

        long end = System.currentTimeMillis();
        System.out.println (end-start);
    }
}
