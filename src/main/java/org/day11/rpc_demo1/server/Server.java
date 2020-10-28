package org.day11.rpc_demo1.server;


import org.day11.rpc_demo1.server.entity.User;
import org.day11.rpc_demo1.server.service.IUserService;

import java.io.*;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author WangQian
 * @Date 2020/10/26 下午 5:08
 */
public class Server {
    private static boolean running = true;

    public static void main(String[] args) throws Exception {

        //服务端开始套接字监听
        ServerSocket server = new ServerSocket(8080);

        System.out.println("Rpc-Demo1--->服务端启动,开始监听客户端套接字");
        //不停监听,接收客户端请求
        while (running) {
            Socket clientSocket = server.accept();

            //对客户端请求进行处理
            process(clientSocket);

            clientSocket.close();
        }

        server.close();
    }

    private static void process(Socket clientSocket) throws Exception {
        //获取客户端的输入输出流,并进行包装
        InputStream in = clientSocket.getInputStream();
        byte[] data = new byte[1024];

        //读取客户端数据
        in.read(data);
        String requestData = new String(data);
        //打印客户端传来的数据
        System.out.println("Rpc-Demo1--->服务端接收的数据: " + requestData);

        //处理客户端发来的数据
        String[] requestDatas = requestData.split(":");
        String className = requestDatas[0];
        String methodName = requestDatas[1];
        Integer userNo = Integer.valueOf(requestDatas[2].trim());

        //通过反射进行对象和方法调用
        Class reflectClass = Class.forName("org.day11.rpc_demo1.server.service.serviceImpl." + className);
        IUserService iUserServiceInfo = (IUserService) reflectClass.newInstance();

        //函数调用, 获取结果
        Method method1 = reflectClass.getMethod(methodName, Integer.class);
        User o = (User) method1.invoke(iUserServiceInfo, userNo);

        //服务端业务处理结果
        System.out.println("Rpc-Demo1--->服务端业务处理结果: " + o.toString());

        //数据封装并写回
        StringBuffer outData = new StringBuffer();
        outData.append(o.getUserNo())
                .append(":")
                .append(o.getName());
        OutputStream out = clientSocket.getOutputStream();
        System.out.println("Rpc-Demo1--->服务端返回的结果: " + outData.toString());
        out.write(outData.toString().getBytes());
        out.flush();
    }
}
