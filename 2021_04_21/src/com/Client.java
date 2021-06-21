package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket s = new Socket("127.0.0.1",8888);
        OutputStream os = s.getOutputStream();
        os.write("hello,i'm client".getBytes());
        os.flush();

        //接收服务器信息
        InputStream is = s.getInputStream();
        byte[] b = new byte[1024];
        String str = "";
        int length = is.read(b);
        while (length != -1){
            str += new String(b,0,length);
            length = is.read(b);
        }
        System.out.println(str);
        os.close();
    }
}
