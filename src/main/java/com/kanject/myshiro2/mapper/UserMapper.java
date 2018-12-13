package com.kanject.myshiro2.mapper;

import com.kanject.myshiro2.domain.User;

public interface UserMapper {

    User findByUsername(String username);

    User findById(Integer id);
}
