package org.day11.rpc_demo2.client;

import org.day11.rpc_demo2.client.entity.UserInfo;
import org.day11.rpc_demo2.middle.MiddleService;

/**
 * @Author WangQian
 * @Date 2020/10/26 下午 6:22
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //直接进行对应方法调用
        UserInfo u = MiddleService.getUerById(111);
        System.out.println("Rpc-Demo2--->客户端处理的结果: " + u.toString());
    }
}
