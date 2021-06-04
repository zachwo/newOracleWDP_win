package com.pojo;

/**
 * POJO（Plain Ordinary Java Object）简单的Java对象，实际就是普通JavaBeans，
 * 是为了避免和EJB混淆所创造的简称。
 */
public class Account {
    private int id;
    private String name;
    private String login;
    private String pwd;
    private double money;

    public Account() {
    }

    public Account(String name, String login, String pwd, double money) {
        this.name = name;
        this.login = login;
        this.pwd = pwd;
        this.money = money;
    }



    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", pwd='" + pwd + '\'' +
                ", money=" + money +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
