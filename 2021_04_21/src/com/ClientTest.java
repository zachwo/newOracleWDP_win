package com;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",8888);//服务器的ip地址&端口号
        OutputStream os = s.getOutputStream();
        os.write("你好，我是客户机".getBytes());
        os.flush();
        os.close();
    }
}
