package org.day11.rpc_demo1.server.service.serviceImpl;

import org.day11.rpc_demo1.server.service.IUserService;
import org.day11.rpc_demo1.server.entity.User;

/**
 * @Author WangQian
 * @Date 2020/10/26 下午 5:08
 */
public class UserServiceImpl implements IUserService {
    @Override
    public User findUserById(Integer id) {
        //查询数据库
        //进行业务处理
        return new User(id, "张三");
    }
}
