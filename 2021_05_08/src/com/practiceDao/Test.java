package com.practiceDao;

import com.practiceDao.pojo.Account;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        AccountDao accountDao = new AccountDao();
        //存钱：
//        int x = accountDao.saveMoney("1",300);
//        System.out.println(x + "行受到了影响");

        //登录：
//        Account account = accountDao.login("wangwu","123456");
//        System.out.println(account);

        //取钱：
//        int x = accountDao.withdrawMoney(800,account);
//        System.out.println(x+ "行受到了影响");
//        System.out.println(account);

        //新用户注册：
//        int x = accountDao.signUp();
//        System.out.println(x + "行受到了影响");

        //查余额：
//        System.out.println(accountDao.getRemain("zacharywong880"));
        //转账：
        System.out.println(accountDao.transMoney()+ "行受到了影响");
    }
}
