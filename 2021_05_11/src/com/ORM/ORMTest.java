package com.ORM;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ORMTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        DButil dbu = new DButil();
        String sql = "select * from student";
        ResultSet rs = dbu.executeQuery(sql);
        ArrayList<Student> students = (ArrayList<Student>) orm(rs,Student.class);
        for (Student s : students){
            System.out.println(s);
        }
    }

    /**
     * 通过反射拿到c的属性到rs中获取值并放入到对应的属性中
     * @param rs
     * @param c
     * @return
     */
    public static List orm(ResultSet rs, Class c) throws SQLException, IllegalAccessException, InstantiationException {
        List list = new ArrayList();
        while (rs.next()){
            Object o = c.newInstance();//创建c对应的当前类的对象

            Field[] fields = c.getDeclaredFields();
            for (Field f : fields){
                f.setAccessible(true);
                String fieldName = f.getName();//获取属性名
                //姑且认为Student类中的属性类型只有可能是int或者String
                if (f.getType().getSimpleName().equals("int")){
                    f.set(o,rs.getInt(fieldName));
                }
                if (f.getType().getSimpleName().equals("String")){
                    f.set(o,rs.getString(fieldName));
                }
            }

            list.add(o);
        }
        return list;
    }
}
