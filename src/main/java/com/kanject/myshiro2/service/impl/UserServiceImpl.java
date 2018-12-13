package com.kanject.myshiro2.service.impl;

import com.kanject.myshiro2.domain.User;
import com.kanject.myshiro2.mapper.UserMapper;
import com.kanject.myshiro2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: Kanject
 */
@Service
public class UserServiceImpl  implements UserService{

    //注入mapper接口
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUsername(String Username) {
        return userMapper.findByUsername(Username);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
