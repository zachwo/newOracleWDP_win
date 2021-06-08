import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.*;
import java.util.Scanner;

public class Task_for_ZiFuLiu_04 {
    //字符流的应用
    //task1:文件流的应用——节点流
    //将以下信息写出到db.properties文件中：
    //username=root-pwd=root-url=aaaaa-driver=com.mysql.jdbc.Driver
    //再通过读取获取到用户名、密码、url和driver后面的值
//    public static void main(String[] args) throws IOException {
//        String addr = "C:/OracleWDP/db.properties";
//        File file = new File(addr);
//        if (!file.exists()){
//            file.createNewFile();
//        }
//
//        FileWriter fw = new FileWriter(addr);
//        fw.write("username=root-pwd=root-url=aaaaa-driver=com.mysql.jdbc.Driver");
//        fw.flush();
//        fw.close();
//
//        FileReader fr = new FileReader(addr);
//        char[] c = new char[3];
//        int length = fr.read(c);
//        String str = "";
//        while (length!=-1){
//            String t = new String(c,0,length);
//            str += t;
//            length = fr.read(c);
//        }
//        fr.close();
//        System.out.println(str);
//        System.out.println("--------------------------");
//        String[] strings = str.split("-");
//        for (String s : strings){
//            //System.out.println(s);
//            String[] strings1 = s.split("=");
//            System.out.println(strings1[strings1.length-1]);
//        }
//    }

    //task2:缓冲流的练习——管道流
    //将以下信息写出到db1.properties文件中：
    //username=root
    //pwd=root
    //url=aaaaa
    //driver=com.mysql.jdbc.Driver
    //再通过读取获取到用户名、密码、url和driver后面的值
    public static void main(String[] args) throws IOException {
        String addr = "C:/OracleWDP/db1.properties";
        File f = new File(addr);
        if (!f.exists()){
            f.createNewFile();
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(addr));
        bw.write("username=root");
        bw.newLine();//写入换行
        bw.write("pwd=root");
        bw.newLine();
        bw.write("url=aaaaa");
        bw.newLine();
        bw.write("driver=com.mysql.jdbc.Driver");
        bw.close();
        //BufferedReader用于一次读取一行数据
        BufferedReader br = new BufferedReader(new FileReader(addr));
        String str = br.readLine(); //一次读取一行
        while (str != null){
            //System.out.println(str);
            String[] strs = str.split("=");
            System.out.println(strs[strs.length-1]);
            str = br.readLine();
        }
    }


}
