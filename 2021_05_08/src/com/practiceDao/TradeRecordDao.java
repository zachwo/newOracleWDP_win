package com.practiceDao;

import com.practiceDao.pojo.TradeRecord;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TradeRecordDao {
    //增：
    public int add(TradeRecord t) throws SQLException, ClassNotFoundException {
        DButil dbu = new DButil();
        String sql = "insert into TradeRecord values(default,?,?,?,now())";
        return dbu.executeUpdate(sql,t.getUserName(),t.getTradeType(),t.getTradeAmount());
    }

    //删
    public int delete(TradeRecord t) throws SQLException, ClassNotFoundException {
        DButil dbu = new DButil();
        String sql = "delete from TradeRecord where id = ?";
        return dbu.executeUpdate(sql,t.getId());
    }

    //改
    public int alter(TradeRecord t) throws SQLException, ClassNotFoundException {
        DButil dbu = new DButil();
        String sql ="update TradeRecord set userName = ?,tradeType = ?,tradeAmount = ?,tradeTime = ? where id = ?";
        return dbu.executeUpdate(sql,t.getUserName(),t.getTradeType(),t.getTradeAmount(),t.getTradeTime(),t.getId());

    }
    //查
    public ArrayList<TradeRecord> check() throws SQLException, ClassNotFoundException {
        DButil dbu = new DButil();
        String sql = "select * from TradeRecord";
        ResultSet rs = dbu.executeQuery(sql);
        ArrayList<TradeRecord> list = new ArrayList<>();
        while (rs.next()){
            TradeRecord tr = new TradeRecord();
            tr.setId(rs.getInt("id"));
            tr.setUserName(rs.getString("userName"));
            tr.setTradeType(rs.getString("tradeType"));
            tr.setTradeAmount(rs.getDouble("tradeAmount"));
            tr.setTradeTime(rs.getString("tradeTime"));
            list.add(tr);
        }
        dbu.closeAll();
        return list;
    }
}
