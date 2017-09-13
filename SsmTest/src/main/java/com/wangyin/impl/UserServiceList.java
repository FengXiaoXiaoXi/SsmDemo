package com.wangyin.impl;

import java.util.List;



import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.wangyin.dao.UserDao;
import com.wangyin.entity.User;
import com.wangyin.inter.UserInterface;



@Transactional
@Service("userServiceList")
public class UserServiceList implements UserInterface {
	@Resource
    private UserDao dao;
	
	public List<String> userList() {
		System.out.println("dao:"+dao);
		return this.dao.getUserList();
	}
	
	public void insert(){
		this.dao.insert();
		System.out.println("插入数据完成");
	}
	
	public void batchinsert(List<User> list){
		this.dao.batchinsert(list);
		System.out.println("批量插入数据完成");
	}

}
