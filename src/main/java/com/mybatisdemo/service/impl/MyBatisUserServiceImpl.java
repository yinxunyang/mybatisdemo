package com.mybatisdemo.service.impl;


import com.mybatisdemo.dao.MyBatisUserDao;
import com.mybatisdemo.pojo.User;
import com.mybatisdemo.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**** imports ****/
@Service
public class MyBatisUserServiceImpl implements MyBatisUserService {
    @Autowired
    private MyBatisUserDao myBatisUserDao = null;

    @Override
    public User getUser(String id) {
        return myBatisUserDao.getUser(id);
    }
}