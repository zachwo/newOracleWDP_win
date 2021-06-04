import java.io.*;
import java.util.Properties;

public class Shujuliu_Zijieliu {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1、属性文件类的操作
        Properties p = new Properties();
        p.load(new FileReader("C:/OracleWDP/db1.properties"));
        System.out.println(p.get("url"));
        //2、数据流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/OracleWDP/ab.txt"));
        dos.writeInt(22);
        dos.writeDouble(10.3);
        dos.flush();
        dos.close();
        DataInputStream dis = new DataInputStream(new FileInputStream("C:/OracleWDP/ab.txt"));
        int x = dis.readInt();
        double y = dis.readDouble();
        System.out.println(x);
        System.out.println(y);
        //3、对象流
        //静态的属性无法保存到硬盘上
        Student s = new Student();
        s.setName("张三");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/OracleWDP/student.txt"));
        oos.writeObject(s);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/OracleWDP/student.txt"));
        Student s1 = (Student)ois.readObject();
        System.out.println(s1.getName());


    }
}














