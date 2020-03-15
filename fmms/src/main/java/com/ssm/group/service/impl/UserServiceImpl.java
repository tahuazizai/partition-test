package com.ssm.group.service.impl;

import com.ssm.group.dao.mapper.UserMapper;
import com.ssm.group.entity.User;
import com.ssm.group.service.MenuService;
import com.ssm.group.service.RedisService;
import com.ssm.group.service.UserService;
import com.ssm.group.service.impl.base.BaseServiceImpl;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @ClassName UserServiceImpl
 * @description 用户服务
 * @date 2020/1/9
 */
@Service
@Log4j
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisService redisService;

    @Override
    public int addUser(User user) {
        this.userMapper.insert(user);
        this.redisService.hset("USER_CODE","USER_"+user.getUserId(),user);
        return 1;
    }
}
