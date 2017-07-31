package com.moyun.leave.base;

import javax.annotation.Resource;

import org.activiti.engine.IdentityService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;

import com.moyun.leave.service.LeaveService;

public class BaseController {
	@Resource
	protected LeaveService leaveService;
	@Resource
	protected IdentityService identityService;
	@Resource
	protected RuntimeService runtimeService;
	@Resource
	protected TaskService taskService;
}
