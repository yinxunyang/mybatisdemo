package com.mybatisdemo.service;


import com.mybatisdemo.pojo.User;

public interface MyBatisUserService {
    User getUser(String id);
}