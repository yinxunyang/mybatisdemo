package com.mybatisdemo.controller;

import com.mybatisdemo.pojo.User;
import com.mybatisdemo.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**** imports ****/
@RestController
public class MyBatisController {

    @Autowired
    private MyBatisUserService myBatisUserService;

    @RequestMapping("/getUser")
    public User getUser(String id) {
        return myBatisUserService.getUser(id);
    }
}