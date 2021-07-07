package com.ORM;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbuTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String sql = "select * from student";
        DButil dbu = new DButil();
        ResultSet rs = dbu.executeQuery(sql);
        ArrayList<Student> list = new ArrayList<>();
        while (rs.next()){
            Student stu = new Student();
            stu.setSNO(rs.getString("SNO"));
            stu.setSNAME(rs.getString("SNAME"));
            stu.setSSEX(rs.getString("SSEX"));
            stu.setSBIRTH(rs.getString("SBIRTH"));
            stu.setCLASSES(rs.getString("CLASSES"));
            list.add(stu);
        }
        dbu.closeAll();
        for (Student s:list){
            System.out.println(s);
        }



    }
}
