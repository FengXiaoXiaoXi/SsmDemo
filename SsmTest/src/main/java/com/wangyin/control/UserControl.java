package com.wangyin.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wangyin.Exception.MyException;
import com.wangyin.entity.User;
import com.wangyin.impl.UserServiceList;

@Controller
@RequestMapping(value = "/userList")
public class UserControl {
	@Resource
	UserServiceList services;

	@RequestMapping(value = "/list")
	public ModelAndView list() {
		
		ModelAndView model=new ModelAndView();
		model.setViewName("/index");
       List<User> userList = services.userList();
       model.addObject("list", userList);
       for(User user:userList){
    	   
    	   System.out.println(user);
       }
       return model;
	}
	@RequestMapping(value = "/insert")
	public ModelAndView insert() {
		ModelAndView model=new ModelAndView();
		model.setViewName("/index");
		services.insert();
       return model;
	}
	@RequestMapping(value = "/batchinsert")
	public ModelAndView batchinsert() {
		ModelAndView model=new ModelAndView();
		model.setViewName("/index");
		List<User> list=new ArrayList<User>();
		String[] names={"小明","小紅","小強","小華","小小","天天","明明","明天","後天"};
		for(int i=0;i<100;i++){
			User user=new User();
			user.setId(i);
			user.setUserName(names[i%names.length]+i);
			user.setPasswd(i%names.length+i+"");
			user.setAge(i);
			list.add(user);
		}
		services.batchinsert(list);
		List<User> userList = services.userList();
		model.addObject("list",userList);
		return model;
	}
	@RequestMapping(value = "/delete")
	public ModelAndView deleteAll() {
		ModelAndView model=new ModelAndView();
		model.setViewName("/index");
		services.deleteAll();
		List<User> userList = services.userList();
		model.addObject("list",userList);
		return model;
	}
	@RequestMapping(value = "/update")
	public ModelAndView update() {
		ModelAndView model=new ModelAndView();
		Map<String,String> map=new HashMap<String,String>();
		map.put("username", "北京");
		map.put("id", "2");
		model.setViewName("/index");
		services.update(map);
		List<User> userList = services.userList();
		model.addObject("list",userList);
		return model;
	}
	@RequestMapping(value = "/deleteById")
	public ModelAndView deleteById(HttpServletRequest request) {
		
		String id=request.getParameter("id");
		ModelAndView model=new ModelAndView();
		model.setViewName("/index");
		services.deleteById(id);
		List<User> userList = services.userList();
		model.addObject("list",userList);
		return model;
	}
	@RequestMapping(value = "/updateById")
	public ModelAndView updateById() {
		ModelAndView model=new ModelAndView();
		Map<String,String> map=new HashMap<String,String>();
		map.put("username", "北京");
		map.put("id", "2");
		
		services.update(map);
		List<User> userList = services.userList();
		model.addObject("list",userList);
		return model;
	}
	@ExceptionHandler()
	@RequestMapping(value = "/register")
	public ModelAndView add(User user) {
		ModelAndView model=new ModelAndView("/index");
		services.addUser(user);
		List<User> userList = services.userList();
		model.addObject("list",userList);
		return model;
	}
}
