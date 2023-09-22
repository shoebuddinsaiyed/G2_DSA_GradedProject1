package com.AdminDepartment;

import com.SuperDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	// Creating methods 
	public String departmentName() {
		return "Welcome to Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	{
		super.isTodayAHoliday();
	}

}
