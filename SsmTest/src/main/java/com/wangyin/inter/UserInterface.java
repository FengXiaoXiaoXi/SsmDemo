package com.wangyin.inter;

import java.util.List;

import com.wangyin.entity.User;

public interface UserInterface {
 public List<String> userList();
 public void insert();
 public void batchinsert(List<User> list);
}
