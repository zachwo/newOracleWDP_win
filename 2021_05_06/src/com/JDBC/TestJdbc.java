package com.JDBC;

import javax.xml.crypto.Data;
import java.sql.*;

/**
 * 通过Java程序进行数据库的访问操作
 * 不同的数据库（eg. MySql/SqlServer/OracleSql）需要不同的驱动类
 */
//JDBC操作步骤：
//1、驱动类的注册
//com.mysql.jdbc.Driver 驱动类
//2、获取连接对象
//Connection 连接对象
//3、获取执行对象
//Statement PreparedStatement 执行对象(java.sql包下)
//4、遍历结果集
//ResultSet 结果集（java.sql下）
//5、关闭连接
public class TestJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1-驱动类注册
        Class.forName("com.mysql.jdbc.Driver");
        //2-获取连接对象
        String url = "jdbc:mysql://localhost:3306/learn_sql?characterEncoding=utf-8";
        //等价于：String url = "jdbc:mysql://127.0.0.1:3306/learn_sql?characterEncoding=uft-8";
        String user = "root";
        String password = "wz1999124";
        Connection con = DriverManager.getConnection(url,user,password);
        //3-获取执行对象
        //3.1增删改 & 建库建表
        Statement st = con.createStatement();
//        String sql = "insert into student(Sno,Sname,Ssex) values('007','邦德','男')";    //sql语句不能加';'
//        int x = st.executeUpdate(sql);    //返回数据库受影响行数
//        System.out.println(x + "行 受影响");
        //4-遍历结果集
        //查
        String sql1 = "select * from student";
        ResultSet rs = st.executeQuery(sql1);
        System.out.println("学号\t姓名\t性别\t出生日期\t\t班级");
        while (rs.next()){
            String sno = rs.getString("sno");
            String sname = rs.getString("sname");
            String ssex = rs.getString("ssex");
            Date sbirth = rs.getDate("sbirth");
            String classes = rs.getString("classes");
            System.out.println(sno+"\t"+sname+"\t"+ssex+"\t"+sbirth+"\t"+classes);
        }
        //5-关闭连接
        st.close();
        con.close();

    }
}