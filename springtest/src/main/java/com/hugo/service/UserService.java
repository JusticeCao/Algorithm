package com.hugo.service;

import com.hugo.mapper.UserMapper;
import com.hugo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {

        return userMapper.selectByPrimaryKey(id);

    }

    public void insertUser(User user) {

        userMapper.insert(user);

    }
}
