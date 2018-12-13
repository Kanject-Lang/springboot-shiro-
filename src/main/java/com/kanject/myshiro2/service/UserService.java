package com.kanject.myshiro2.service;

import com.kanject.myshiro2.domain.User;

public interface UserService {

    User findByUsername(String Username);

    User findById(Integer id);
}
