package com.moyun.leave.mapper;

import com.moyun.leave.entity.Leave;

public interface LeaveMapper {
	public void insertLeave(Leave leave);

	public Leave selectLeaveByPId(String processInstanceId);
}
