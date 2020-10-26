package org.day11.rpc_demo2.server.service.serviceImpl;

import org.day11.rpc_demo2.entity.UserInfo;
import org.day11.rpc_demo2.server.service.IUserServiceInfo;

/**
 * @Author WangQian
 * @Date 2020/10/26 下午 5:08
 */
public class UserServiceInfoImpl implements IUserServiceInfo {
    @Override
    public UserInfo findUserById(Integer id) {
        //查询数据库
        //进行业务
        return new UserInfo(id, "张三");
    }
}
