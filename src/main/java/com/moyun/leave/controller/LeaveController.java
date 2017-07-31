package com.moyun.leave.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.activiti.engine.TaskService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.moyun.leave.base.BaseController;
import com.moyun.leave.entity.Leave;
import com.moyun.leave.utils.UserUtil;

@Controller
@RequestMapping("/leave")
public class LeaveController extends BaseController {
	@RequestMapping(value = "/leaveAdd", method = RequestMethod.GET)
	public String leaveAdd() {
		return "/leave/leaveAdd";
	}

	@RequestMapping(value = "/leaveAdd", method = RequestMethod.POST)
	public String addLeave(Leave leave, HttpSession session) {
		String userId = ((User) session.getAttribute("user")).getId();

		System.out.println(leave.toString());
		Map<String, Object> variables = new HashMap<String, Object>();
		User user = UserUtil.getUserFromSession(session);
		identityService.setAuthenticatedUserId(user.getId());
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("leaveProcess", variables);
		String pId = processInstance.getId();
		System.out.println("pid:"+pId);
		//保存请假单
		leave.setpId(pId);
		leave.setUser(userId);
		leave.setCreateTime(new Date());
		leaveService.save(leave);
		return "/main";
	}
	
	@RequestMapping(value = "/leaveList")
	public String leaveList(HttpSession session,ModelMap model) {
		Group group = (Group)session.getAttribute("group");
		System.out.println(group.getId());
		List<Task> tasks = taskService.createTaskQuery().taskAssignee(group.getId()).list();
		System.out.println(tasks.size());
		List<Leave> leaves = leaveService.selectLeaveByTasks(tasks);
		System.out.println(leaves.size());
		model.put("leaves",leaves); 
		return "/leave/leaveShow";
	}
	
	@RequestMapping(value = "/agreeLeave")
	public String agreeLeave(@RequestParam("pId") String pId) {
		String taskId = taskService.createTaskQuery().processInstanceId(pId).singleResult().getId();
		taskService.complete(taskId);
		return "/main";
	}
}
