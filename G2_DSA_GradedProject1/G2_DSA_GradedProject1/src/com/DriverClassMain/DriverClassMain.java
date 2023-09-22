package com.DriverClassMain;

// importing classes from their respective packages
import com.HrDepartment.HrDepartment;
import com.AdminDepartment.AdminDepartment;
import com.TechDepartment.TechDepartment;

public class DriverClassMain {

	public static void main(String[] args) {

		// creating object for HR Department
		HrDepartment hrdepartmentobject = new HrDepartment();

		// creating object for Tech Department
		TechDepartment techdepartmentobject = new TechDepartment();

		// creating object for Admin Department
		AdminDepartment admindepartmentobject = new AdminDepartment();

		// Calling and printing Admin Department Methods
		System.out.println(admindepartmentobject.departmentName());
		System.out.println(admindepartmentobject.getTodaysWork());
		System.out.println(admindepartmentobject.getWorkDeadline());
		System.out.println(admindepartmentobject.isTodayAHoliday());

		// Creating a line break
		System.out.println();

		// Calling and printing HR Department Methods
		System.out.println(hrdepartmentobject.departmentName());
		System.out.println(hrdepartmentobject.doActivity());
		System.out.println(hrdepartmentobject.getTodaysWork());
		System.out.println(hrdepartmentobject.getWorkDeadline());
		System.out.println(hrdepartmentobject.isTodayAHoliday());

		// Creating a line break
		System.out.println();

		// Calling and printing Tech Department Methods
		System.out.println(techdepartmentobject.departmentName());
		System.out.println(techdepartmentobject.getTodaysWork());
		System.out.println(techdepartmentobject.getWorkDeadline());
		System.out.println(techdepartmentobject.getTechStackInformation());
		System.out.println(techdepartmentobject.isTodayAHoliday());
	}

}

/*
 * Project Created by below team members:
 * Ishika Nehra (Ishikanehra22@gmail.com) 
 * Shoebuddin Saiyed (shoeb.saiyed@yahoo.co.in) 
 * Shivam Kumar Raj (darksaber8969@gmail.com) 
 * Sandeep (sandeeprvsh@gmail.com)
 */