package com.moyun.leave.entity;

import java.io.Serializable;
import java.util.Date;

public class Leave implements Serializable{
	private static final long serialVersionUID = 5038107739033848999L;
	
	private int id;
	private String user;
	private int dayNumber;
	private String reason;
	private String remark;
	private Date createTime;
	private Date endTime;
	//进程id
	private String pId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getDayNumber() {
		return dayNumber;
	}
	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Leave [id=" + id + ", user=" + user + ", dayNumber=" + dayNumber + ", reason=" + reason + ", remark="
				+ remark + ", createTime=" + createTime + ", endTime=" + endTime + "]";
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
}
