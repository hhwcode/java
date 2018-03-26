package com.test.service.impl;

import com.test.model.User;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public User getUser() {
        User user = new User();
        user.setId(1);
        user.setName("hehongwei");
        return user;
    }
}
