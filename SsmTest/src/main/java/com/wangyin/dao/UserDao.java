package com.wangyin.dao;

import java.util.List;
import java.util.Map;

import com.wangyin.entity.User;

public interface UserDao {
  public List<User>  getUserList();
  public void insert();
  public void batchinsert(List<User> list);
  public void deleteAll();
  public void update(Map<String,String> map);
  public void updateById(String id);
  public void deleteById(String id);
  public void add(User user);
}
