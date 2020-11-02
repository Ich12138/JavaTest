package org.day11.rpc_demo2.middle;

/**
 * @Author WangQian
 * @Date 2020/10/26 下午 6:22
 */


import org.day11.rpc_demo2.client.entity.UserInfo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 中间服务层, 隐藏客户端调用的tcp/ip连接细节, 简称框架
 */
public class MiddleService {

    public static UserInfo getUerById(Integer id) throws Exception {
        //创建套接字, 连接服务端
        Socket client = new Socket("localhost", 8080);

        //获取客户端的输出流, 发送数据
        OutputStream out = client.getOutputStream();
        String requestData = "UserServiceInfoImpl:findUserById:" + id;
        System.out.println("Rpc-Demo2--->客户端发送的数据: " + requestData);
        out.write(requestData.getBytes());
        out.flush();

        //获取客户端输入流
        InputStream in = client.getInputStream();
        byte[] resultData = new byte[1024];

        //将服务端的数据读入data数组
        in.read(resultData);
        String userInfo = new String(resultData, "utf-8");

        //接收服务端的返回数据
        System.out.println("Rpc-Demo2--->客户端接收的数据: " + userInfo);

        //进行数据处理, 最后返回给调用者
        String[] userInfoArray = userInfo.split(":");
        UserInfo user = UserInfo.builder()
                .userNo(Integer.parseInt(userInfoArray[0]))
                .name(userInfoArray[1])
                .age(Integer.parseInt(userInfoArray[2]))
                .gender(userInfoArray[3])
                .build();
        client.close();
        return user;
    }
}
