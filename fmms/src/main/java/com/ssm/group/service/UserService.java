package com.ssm.group.service;

import com.ssm.group.entity.User;
import com.ssm.group.service.base.BaseService;

/**
 * @ClassName UserService
 * @description 用户服务接口
 * @date 2020/1/9
 */
public interface UserService extends BaseService<User> {
    int addUser(User user);
}
