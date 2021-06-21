package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//socket对象类似于两个人打电话时候用的手机，两个人交流的时候传输的是语音信号，而不是手机
//accept方法会一直监听客户端发过来的信息，如果有客户端发过来信息，则accept方法会自己生成一个socket对象并接收信息
//注意客户端的socket对象和accept方法生成的socket对象不是同一个，socket对象只是传递信息的一个媒介
//socket对象联系两个程序，只要其中一方关闭了socket连接，整个通信就断了

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("waiting for client ...");
        Socket s = ss.accept();//生成Socket对象以接收客户机的信息
        System.out.println(s.getInetAddress().getHostAddress()+" connected successfully");

        InputStream is = s.getInputStream();//输入流接收客户端发出的字节数组
        byte[] b = new byte[24];
        String str = "";
        int length = is.read(b);
        //此处有bug，原因未知
//        while (length != -1){
//            str += new String(b,0,length);
//            length = is.read(b);
//        }
        str = new String(b, 0, length);
        System.out.println(str);

        //服务器返回消息
        OutputStream os = s.getOutputStream();
        os.write("i'm server, i've got your message".getBytes());
        os.flush();
        os.close();

    }
}
