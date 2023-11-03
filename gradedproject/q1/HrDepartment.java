package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}