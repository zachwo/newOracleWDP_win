package com.udp;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        InetAddress ia = InetAddress.getByName("127.0.0.1");
        byte[] b = "hello server".getBytes();
        // 构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
        DatagramPacket dp = new DatagramPacket(b,b.length,ia,8080);
        DatagramSocket ds = new DatagramSocket();
        System.out.println("prepare to send data");
        ds.send(dp);
        System.out.println("data sent successfully");

    }
}
