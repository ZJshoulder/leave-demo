package com.moyun.leave.controller;

import javax.servlet.http.HttpSession;

import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.moyun.leave.base.BaseController;
import com.moyun.leave.utils.UserUtil;

@Controller
public class LoginController extends BaseController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String toLogin(){
		return "/user/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String toLogin(@RequestParam("userId")String userId,HttpSession session){
		User user= identityService.createUserQuery().userId(userId).singleResult();
		if(user != null){
			user.getEmail();
			Group group = identityService.createGroupQuery().groupMember(userId).singleResult();
			UserUtil.saveUserToSession(session, user);
			session.setAttribute("group", group);
			return "/main";
		}else{
			return "redirect:/login";
		}
	}
	
}
