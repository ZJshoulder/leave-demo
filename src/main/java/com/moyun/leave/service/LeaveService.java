package com.moyun.leave.service;

import java.util.List;

import org.activiti.engine.task.Task;
import org.springframework.transaction.annotation.Transactional;

import com.moyun.leave.entity.Leave;

@Transactional
public interface LeaveService {

	void save(Leave leave);

	List<Leave> selectLeaveByTasks(List<Task> tasks);
	
}
