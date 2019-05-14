package com.mybatisdemo.pojo;

import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**** imports ****/
// 标明是一个实体类
@Entity(name = "user")
// 定义映射的表
@Table(name = "t_user")
@Alias(value = "user")// MyBatis指定别名
public class User {
    // 标明主键
    @Id
    private String id = null;
    // 定义属性和表的映射关系
    private String userName = null;

    private String note = null;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}