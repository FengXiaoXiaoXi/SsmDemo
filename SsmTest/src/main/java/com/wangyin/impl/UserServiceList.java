package com.wangyin.impl;

import java.util.List;
import java.util.Map;

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
	
	public List<User> userList() {
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

	public void deleteAll() {
		this.dao.deleteAll();
		System.out.println("删除所有数据成功");
		
	}

	public void update(Map<String, String> map) {
		this.dao.update(map);
	}
	
	public void updateById(String id){
		this.dao.updateById(id);
		
	}
	public void deleteById(String id){
		this.dao.deleteById(id);
		
	}

}
