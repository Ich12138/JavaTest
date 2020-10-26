package org.day11.rpc_demo1.client;

import org.day11.rpc_demo1.entity.User;

import java.io.*;
import java.net.Socket;

/**
 * @Author WangQian
 * @Date 2020/10/26 下午 5:08
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //创建套接字,连接服务端
        Socket client = new Socket("localhost", 8080);

        //获取客户端的输出流, 发送数据
        OutputStream out = client.getOutputStream();
        String requestData = "UserServiceImpl:findUserById:123";
        System.out.println("Rpc-Demo1--->客户端发送的数据: " + requestData);
        out.write(requestData.getBytes());
        out.flush();

        //获取客户端输入流
        InputStream in = client.getInputStream();
        byte[] data = new byte[1024];

        //将服务端的数据读入data数组
        in.read(data);
        String userInfo = new String(data, "utf-8");

        //接收服务端的返回数据
        System.out.println("Rpc-Demo1--->接收服务端的返回数据: " + userInfo);

        //客户端进行数据处理
        String[] userInfoArray = userInfo.split(":");
        User user = User.builder()
                .userNo(Integer.parseInt(userInfoArray[0]))
                .name(userInfoArray[1])
                .build();
        System.out.println("Rpc-Demo1--->客户端处理结果: " + user.toString());
        client.close();
    }
}
