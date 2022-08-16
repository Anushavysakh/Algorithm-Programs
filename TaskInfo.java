package com.algorithmprograms.bridgelabz;

public class TaskInfo {


	String taskName;
	long deadline;
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public long getDeadline() {
		return deadline;
	}
	public void setDeadline(long deadline) {
		this.deadline = deadline;
	}
	public TaskInfo(String taskName, long deadline) {
		super();
		this.taskName = taskName;
		this.deadline = deadline;
	}
	
	
}

