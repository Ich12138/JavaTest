package org.day11.rpc_demo2.client;

import org.day11.rpc_demo2.entity.UserInfo;
import org.day11.rpc_demo2.middle.MiddleService;

/**
 * @Author WangQian
 * @Date 2020/10/26 下午 6:22
 */
public class Client {
    public static void main(String[] args) throws Exception {
        UserInfo u = MiddleService.getUerById(123);
        System.out.println(u.getName());
    }
}
