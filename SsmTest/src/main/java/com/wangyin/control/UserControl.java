package com.wangyin.control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
       List<String> userList = services.userList();
       for(String data:userList){
    	   System.out.println(data);
       }
       model.addObject("list", userList);
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
		List<String> userList = services.userList();
		model.addObject("list",userList);
		return model;
	}
}
