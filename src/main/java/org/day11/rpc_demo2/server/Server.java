package org.day11.rpc_demo2.server;

import org.day11.rpc_demo2.server.entity.UserInfo;
import org.day11.rpc_demo2.server.service.IUserServiceInfo;

import java.io.InputStream;
import java.io.OutputStream;
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

        System.out.println("Rpc-Demo2--->服务端启动,开始监听客户端套接字");

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
        //获取客户端的输入流,并进行包装
        InputStream in = clientSocket.getInputStream();
        byte[] data = new byte[1024];

        //读取客户端数据
        in.read(data);
        String requestData = new String(data);
        //打印客户端传来的数据
        System.out.println("Rpc-Demo2--->服务端接收的数据: " + requestData);

        //处理客户端发来的数据
        String[] requestDatas = requestData.split(":");
        String className = requestDatas[0];
        String methodName = requestDatas[1];
        Integer userNo = Integer.valueOf(requestDatas[2].trim());

        //通过反射进行对象和方法调用
        Class reflectClass = Class.forName("org.day11.rpc_demo2.server.service.serviceImpl." + className);
        IUserServiceInfo iUserServiceInfo = (IUserServiceInfo) reflectClass.newInstance();
        Method method1 = reflectClass.getMethod(methodName, Integer.class);

        //获取调用结果
        UserInfo userInfo = (UserInfo) method1.invoke(iUserServiceInfo, userNo);

        //服务端业务处理结果
        System.out.println("Rpc-Demo2--->服务端业务处理结果: " + userInfo.toString());

        //数据处理并返回给客户端
        StringBuffer outData = new StringBuffer();
        outData.append(userInfo.getUserNo())
                .append(":")
                .append(userInfo.getName())
                .append(":")
                .append(userInfo.getAge())
                .append(":")
                .append(userInfo.getGender());
        OutputStream out = clientSocket.getOutputStream();
        System.out.println("Rpc-Demo2--->服务端返回的结果: " + outData.toString());
        out.write(outData.toString().getBytes());
        out.flush();
    }
}
