package com.wangyin.inter;

import java.util.List;
import java.util.Map;

import com.wangyin.entity.User;

public interface UserInterface {
 public List<User> userList();
 public void insert();
 public void batchinsert(List<User> list);
 public void deleteAll();
 public void update(Map<String,String> map);
}
