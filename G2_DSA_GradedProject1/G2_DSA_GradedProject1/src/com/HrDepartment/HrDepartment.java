package com.HrDepartment;

import com.SuperDepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	// Creating methods
	public String departmentName() {
		return "Welcome to HR Department";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}

	{
		super.isTodayAHoliday();
	}

}