package com.mybatisdemo.dao;


import com.mybatisdemo.pojo.User;
import org.springframework.stereotype.Repository;

/**** imports ****/
@Repository
public interface MyBatisUserDao {
    User getUser(String id);
}