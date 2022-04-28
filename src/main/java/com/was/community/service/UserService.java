package com.was.community.service;

import com.was.community.Dao.UserMapper;
import com.was.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: wasx
 * @Date: 2022/4/27 - 04 - 27 - 22:23
 * @Description: com.was.community.service
 * @version: 1.0
 */

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id){
        return userMapper.selectById(id);
    }
}
