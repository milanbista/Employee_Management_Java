package com.application.controller;

import java.util.Scanner;

import com.application.entity.Employee;
import com.application.service.AdminService;
import com.application.service.UserService;

public class AdminController {

	public static void adminPage(Employee employee, Scanner scan) {
		System.out.println("This is Adim Page: ");
		System.out.println("Name: " + employee.getEmp_name() + "  department: " + employee.getEmp_department()
				+ " role: " + employee.getEmp_role());
		System.out.println(" 2: Employee Page \n 3. Department Page \n 4: Update My User \n 5: Logout");
		String response = scan.nextLine();

		switch (response) {
		case "1":
			// go to main page
			//this is main page
			break;
		case "2":
			// got to employee page
			AdminService.employeePageService(employee, scan);
			break;

		case "3":
			// go to department page
			AdminService.departmentPageService(employee, scan);
			break;

		case "4":
			// go to update user page
			AdminService.myUserPageService(employee, scan);
			break;
		
		case "5":
			//logout
			return;

		default:
			break;
		}
	}

}
