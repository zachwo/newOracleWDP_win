package com;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("等待连接...");

        Socket s = ss.accept();//接受客户机的Socket对象
        System.out.println(s.getInetAddress().getHostAddress()+"连接成功！");

        InputStream is = s.getInputStream();
        byte[] b = new byte[24];
        String str = "";
        int length = is.read(b);
        while (length != -1){
            String t = new String(b,0,length);
            str += t;
            length = is.read(b);
        }
        System.out.println(str);



    }
}
