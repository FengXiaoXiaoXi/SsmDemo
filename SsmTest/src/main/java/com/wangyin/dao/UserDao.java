package com.wangyin.dao;

import java.util.List;

import com.wangyin.entity.User;

public interface UserDao {
  public List<String>  getUserList();
  public void insert();
  public void batchinsert(List<User> list);
}
