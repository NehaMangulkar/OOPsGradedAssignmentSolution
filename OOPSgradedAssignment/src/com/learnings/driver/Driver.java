package com.learnings.driver;

import com.learnings.admin.AdminDept;
import com.learnings.tech.TechDept;
import com.mylearnings.hrdept.HrDept;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDept admindept=new AdminDept();
		HrDept hrdept = new HrDept();
		TechDept techdept = new TechDept();
		
		String deptNameAdmin=admindept.departmentName();
		System.out.println("Welcome to "+deptNameAdmin);
		
		String getWorkAdmin=admindept.getTodaysWork();
		System.out.println(getWorkAdmin);
		
		String workDeadlineAdmin = admindept.getWorkDeadline();
		System.out.println(workDeadlineAdmin);
		
		
		String holidayAdmin = admindept.isTodayAHoliday();
		System.out.println(holidayAdmin );
		
		System.out.println();
		
		String deptNameHR=hrdept.departmentName();
		System.out.println("Welcome to "+deptNameHR);
		
		String activityHR = hrdept.doActivity();
		System.out.println(activityHR);
		
		String getWorkHR = hrdept.getTodaysWork();
		System.out.println(getWorkHR);
		
		String deadlineHR = hrdept.getWorkDeadline();
		System.out.println(deadlineHR);
		
		String holidayHR = hrdept.isTodayAHoliday();
	    System.out.println(holidayHR);
	    
	    System.out.println();
	    
	    String deptNameTech=techdept.departmentName();
		System.out.println("Welcome to "+deptNameTech);
		
		String getWorkTech = techdept.getTodaysWork();
		System.out.println(getWorkTech);
		
		String deadlineTech = techdept.getWorkDeadline();
		System.out.println(deadlineTech);
		
		String getStackInfo = techdept.getTechStackInformation();
		System.out.println(getStackInfo);
		
		String holidayTech = techdept.isTodayAHoliday();
		System.out.println(holidayTech);
		
		
		
		
		
		
		
	    
	    
		
		
		
		
		
		
		
		
		
		
		

	}

}
