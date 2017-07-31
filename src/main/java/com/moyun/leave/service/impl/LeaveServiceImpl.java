package com.moyun.leave.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.activiti.engine.task.Task;
import org.springframework.stereotype.Service;

import com.moyun.leave.entity.Leave;
import com.moyun.leave.mapper.LeaveMapper;
import com.moyun.leave.service.LeaveService;

@Service
public class LeaveServiceImpl implements LeaveService {
	@Resource
	protected LeaveMapper leaveMapper;

	@Override
	public void save(Leave leave) {
		leaveMapper.insertLeave(leave);
	}

	@Override
	public List<Leave> selectLeaveByTasks(List<Task> tasks) {
		 List<Leave> list = new ArrayList<Leave>();
		 for (Task task : tasks) {
			 list.add(leaveMapper.selectLeaveByPId(task.getProcessInstanceId()));
			System.out.println( leaveMapper.selectLeaveByPId(task.getProcessInstanceId()).getUser());
		}
		return list;
	}
}
