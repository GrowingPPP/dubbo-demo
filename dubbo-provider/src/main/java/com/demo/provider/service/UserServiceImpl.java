package com.demo.provider.service;

import com.demo.api.User;
import com.demo.api.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User selectUserById(Integer id) {
        User user = new User();
        user.setAge(10);
        user.setId(id);
        user.setName("iii");
        return user;
    }
}
