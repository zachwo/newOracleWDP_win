package com;

import jdk.swing.interop.LightweightFrameWrapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] b = new byte[1024];
        int length = is.read(b); //接收客户机发送的文件
        //将接收到的文件转存到磁盘
        File f = new File("C:/OracleWDP/向日葵.backup.jpg");
//        File f = new File("C:/OracleWDP/test.png");
        if (!f.exists()){
            f.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(f);
        while (length != -1){   //边接收边转存
            fos.write(b,0,length);
            length = is.read(b);
        }
        fos.flush();
        fos.close();
        is.close();

    }
}
