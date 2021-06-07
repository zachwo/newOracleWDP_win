/*
 * io流
 * input 与output 要以应用程序为中心，而不是以磁盘为中心
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//字符流：XXXReader/ XXXWriter
public class Test_for_ZiFuLiu {
    public static void main(String[] args) throws IOException {
    String addr = "C:\\OracleWDP\\abc.txt";

    //task1: 文件的读入
    //读取字符串用字符流(input)
    FileReader fr = new FileReader(addr);
    char c[] = new char[3];
    int length = fr.read(c); //最多读取c.length长度的字符串，同时返回本次读取的字符长度
    while (length != -1){   //文件读完的标志的read()返回的数值为-1
        String str = new String(c,0,length);
        System.out.print(str);
        length = fr.read(c);
    }
    fr.close(); //如果还想重新使用abc.txt这个文件就重新new一遍

    //写文件(output)
    FileWriter fw = new FileWriter(addr,true);//true表示从目标文件末尾追加。否则是覆盖
    fw.write("这是一条从代码中写入的信息\r\n");
    fw.flush(); // 把流中的内容强制冲刷出去,close中也包含flush功能
    fw.close();



    }
}
