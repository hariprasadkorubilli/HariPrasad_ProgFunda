package com.gradedproject.q1;

public class Main {

	public static void main(String[] args) {
		AdminDepartment ad=new AdminDepartment();
		System.out.println("Welcome to "+ad. departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());

		System.out.println();

		HrDepartment hd=new HrDepartment();
		System.out.println("Welcome to "+hd. departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());

		System.out.println();

		TechDepartment td=new TechDepartment();
		System.out.println("Welcome to "+td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
	}
}


