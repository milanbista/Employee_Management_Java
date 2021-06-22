package com.application.controller;

import java.util.Scanner;

import com.application.entity.Employee;
import com.application.service.UserService;

public class UserController {

	public static void userPage(Employee employee, Scanner scan) {
		System.out.println("This is UserPage: ");
		System.out.println(" Name: " + employee.getEmp_name() + "  department: " + employee.getEmp_department()
				+ " role: " + employee.getEmp_role());
		System.out.println(" 1. Department Page \n 2: Update My User \n 3: main page \n 4: Logout");
		String response = scan.nextLine();
		switch (response) {
		case "1":
			UserService.departmentPageService(employee, scan);
			break;
		case "2":
			UserService.myUserPageService(employee, scan);
			break;

		case "3":
			// go to main page
			UserController.userPage(employee, scan);
			break;

		case "4":
			// logout
			return;

		default:
			break;
		}
	}

}
