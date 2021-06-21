package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8080);
        byte[] b = new byte[1024];
        //构造数据报包，用来接收长度为 length 的包，在缓冲区中指定了偏移量  。
        DatagramPacket dp = new DatagramPacket(b,0,b.length);
        System.out.println("waiting for receive");
        ds.receive(dp);
        String str = new String(b,0,dp.getLength());
        System.out.println(str);
    }
}
