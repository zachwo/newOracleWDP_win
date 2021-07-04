package com.practiceDao.pojo;


import java.util.Date;

public class TradeRecord {
    private int id;
    private String user;
    private String tradeType;
    private Date tradeTime;

    public TradeRecord() {
    }

    @Override
    public String toString() {
        return "TradeRecord{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", tradeType='" + tradeType + '\'' +
                ", tradeTime=" + tradeTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }
}
