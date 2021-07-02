package com.batch;

import com.Dao.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 批处理
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
            ps.addBatch();
//            if (i%500 == 0){
//               ps.executeBatch();
//               ps.clearBatch();
//            }
        }
        ps.executeBatch();
        con.commit();
        dbu.closeAll();

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
