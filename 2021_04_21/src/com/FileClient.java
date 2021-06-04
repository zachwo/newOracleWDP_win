package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",6666);
//        Socket s = new Socket("192.168.90.254",6666);
        //读文件
        FileInputStream fis = new FileInputStream("C:/OracleWDP/向日葵.jpg");
        byte[] b = new byte[1024];
        int length = fis.read(b);
        //传输给服务器
        OutputStream os = s.getOutputStream();
        while(length!=-1){
           os.write(b,0,length);
           length = fis.read(b);
           //os.flush();
        }
        os.flush();
        os.close();
        fis.close();
    }
}
