package org.day11.rpc_demo2.middle;

/**
 * @Author WangQian
 * @Date 2020/10/26 下午 6:22
 */


import org.day11.rpc_demo2.entity.UserInfo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 中间服务层,隐藏客户端调用的tcp/ip连接细节
 * */
public class MiddleService {

    public static UserInfo getUerById(Integer id) throws Exception {
        //创建套接字,连接服务端
        Socket client = new Socket("localhost", 8080);

        //获取客户端的输出流
        OutputStream out = client.getOutputStream();
        out.write("UserServiceInfoImpl:findUserById:123".getBytes());
        out.flush();

        //获取客户端输入流
        InputStream in = client.getInputStream();
        byte[] data = new byte[1024];


        //将服务端的数据读入data数组
        in.read(data);
        String userInfo = new String(data, "utf-8");
        System.out.println(userInfo);
        String[] userInfoArray = userInfo.split(":");
        UserInfo user = UserInfo.builder()
                .userNo(Integer.parseInt(userInfoArray[0]))
                .name(userInfoArray[1])
                .build();
        client.close();
        return user;
    }
}
