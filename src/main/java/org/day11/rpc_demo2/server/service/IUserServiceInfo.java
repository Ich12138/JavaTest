package org.day11.rpc_demo2.server.service;

import org.day11.rpc_demo2.entity.UserInfo;

/**
 * @Author WangQian
 * @Date 2020/10/26 下午 5:09
 */
public interface IUserServiceInfo {
    UserInfo findUserById(Integer id);
}
