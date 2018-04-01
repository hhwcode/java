package com.test.controller;

import com.test.model.User;
import com.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("hello")
    public User hello() {
        return userService.getUser();
    }
}
