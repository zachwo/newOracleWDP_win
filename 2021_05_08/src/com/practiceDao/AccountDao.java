package com.practiceDao;

import com.practiceDao.pojo.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountDao {
    //增
    public int add(Account account) throws ClassNotFoundException, SQLException {
        DButil dButil = new DButil();
        Connection connection = dButil.getConnection();

        String sql = "insert into account(id,name, login, pwd, money) values(default,?,?,?,?)";
        int x = dButil.executeUpdate(sql,account.getName(),account.getLogin(),account.getPwd(),account.getMoney());

        dButil.closeAll();
        return(x);
    }
    //删
    public int delete(Account account) throws ClassNotFoundException, SQLException {
        DButil dButil = new DButil();
        Connection connection = dButil.getConnection();

        String sql = "delete from account where id=?";
        int x = dButil.executeUpdate(sql,account.getId());

        dButil.closeAll();
        return(x);
    }
    //改
    public int alter(Account account) throws ClassNotFoundException, SQLException {
        DButil dButil = new DButil();
        Connection connection = dButil.getConnection();

        String sql ="update account set name = ?,pwd = ?,money = ? where login = ?";
        int x = dButil.executeUpdate(sql,account.getName(),account.getPwd(),account.getMoney(),account.getLogin());

        dButil.closeAll();
        return(x);
    }
    //查
    public ArrayList<Account> check() throws ClassNotFoundException, SQLException {
        DButil dButil = new DButil();
        Connection connection = dButil.getConnection();

        String sql = "select * from account";
        ResultSet rs = dButil.executeQuery(sql);

        ArrayList<Account> list = new ArrayList<>();
        while (rs.next()){
            Account account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setLogin(rs.getString("login"));
            account.setPwd(rs.getString("pwd"));
            account.setMoney(rs.getDouble("money"));
            list.add(account);
        }

        dButil.closeAll();
        return list;
    }
    //模糊+组合查询
    public ArrayList<Account> blurCheck(String name, String login) throws SQLException, ClassNotFoundException {
        String sql = "select * from account where 1=1";
        ArrayList params = new ArrayList<>();   //参数集合
        if (name != null){
            sql += " and name like ?";
            params.add("%"+name+"%");
        }
        if (login != null){
            sql += " and login like ?";
            params.add("%"+login+"%");
        }

        DButil dButil = new DButil();
        ResultSet rs = dButil.executeQuery(sql,params.toArray()); // 一定要记得调用toArray()方法!!!，否则编译器会将list集合看作一个整体参数

        ArrayList<Account> list = new ArrayList<>();
        while (rs.next()){
            Account account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setLogin(rs.getString("login"));
            account.setPwd(rs.getString("pwd"));
            account.setMoney(rs.getDouble("money"));
            list.add(account);
        }

        dButil.closeAll();
        return list;

    }

//————————————————————————————————5.8日新增————————————————————————————————————————

    //存钱方法
    public int saveMoney(String id, double money) throws SQLException, ClassNotFoundException {
        String sql = "update account set money = money+? where id=?";
        DButil dbu = new DButil();
        int x = dbu.executeUpdate(sql,money,id);
        return x;
    }

    //登录方法
    public Account login(String login, String pwd) throws SQLException, ClassNotFoundException {
        DButil dbu = new DButil();
        String sql = "select * from account where login = ? and pwd = ?";
        ResultSet rs = dbu.executeQuery(sql,login,pwd);
        if (rs.next()){
            System.out.println("登录成功！");
            Account account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setLogin(rs.getString("login"));
            account.setPwd(rs.getString("pwd"));
            account.setMoney(rs.getDouble("money"));
            dbu.closeAll();
            return account;
        }else {
            System.out.println("用户名或密码错误！");
            return null;
        }
    }

    //取钱方法
    public int withdrawMoney(double money,Account account) throws SQLException, ClassNotFoundException {
        if (account.getMoney() < money){
            System.out.println("余额不足，取款失败");
            return 0;
        }
        account.setMoney (account.getMoney() - money);
        DButil dbu = new DButil();
        String sql = "update account set money = money-? where id=?";
        int x = dbu.executeUpdate(sql,money,account.getId());
        return x;
    }

    //新用户注册
    public int signUp() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.nextLine();
        System.out.println("请输入登录账号：");
        String login = scanner.nextLine();
        System.out.println("请输入登录密码：");
        String pwd = scanner.nextLine();
        System.out.println("请再次输入登录密码确认：");
        String pwd1 = scanner.nextLine();
        while (!pwd.equals(pwd1)){
            System.out.println("两次输入的登录密码不一致，请重新输入密码：");
            pwd = scanner.nextLine();
            System.out.println("请再次输入登录密码确认：");
            pwd1 = scanner.nextLine();
        }
        String sql = "INSERT \n" +
                "INTO account(id,name, login, pwd, money) \n" +
                "VALUES(DEFAULT,?,?,?,0);";
        DButil dbu = new DButil();
        return dbu.executeUpdate(sql,name,login,pwd);
    }

    //查询余额
    public double getRemain(String login) throws SQLException, ClassNotFoundException {
        String sql = "select money from account where login = ?";
        DButil dbu = new DButil();
        ResultSet rs = dbu.executeQuery(sql,login);
        rs.next();
        double remain = rs.getDouble("money");
        rs.close();
        return remain;

    }

    //转账
    public int transMoney() throws SQLException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入转账账户和密码：");
        String login = scan.nextLine();
        String pwd = scan.nextLine();
        Account account = login(login,pwd);
        if (account == null){
            System.out.println("账户或密码错误，转账失败！");
            return 0;
        }
        System.out.println("请输入收款账户：");
        String login1 = scan.nextLine();
        DButil dbu = new DButil();
        String sql = "select * from account where login = ?";
        ResultSet rs = dbu.executeQuery(sql,login1);
        if (!rs.next()){
            System.out.println("查无此人，转账失败！");
            return 0;
        }
        System.out.println("请输入转账金额：");
        double money = scan.nextDouble();
        if (account.getMoney() < money){
            System.out.println("余额不足，转账失败！");
            return 0;
        }
        String sql1 = "update account set money = money - ? where login = ?;";
        String sql2 = "update account set money = money + ? where login = ?;";
        int x = dbu.executeUpdate(sql1,money,login);
        x += dbu.executeUpdate(sql2,money,login1);

        return x;

    }

}
