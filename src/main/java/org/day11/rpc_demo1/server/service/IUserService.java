package org.day11.rpc_demo1.server.service;

import org.day11.rpc_demo1.server.entity.User;

/**
 * @Author WangQian
 * @Date 2020/10/26 下午 5:09
 */
public interface IUserService {
    User findUserById(Integer id);
}
