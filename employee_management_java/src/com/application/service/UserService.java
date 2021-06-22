package com.application.service;

import java.util.Scanner;

import com.application.controller.UserController;
import com.application.entity.Department;
import com.application.entity.Employee;
import com.application.repo.EmployeeDatabase;

public class UserService {

	public static void departmentPageService(Employee employee, Scanner scan) {
		System.out.println("1: show all departments \n 2: show department by id \n 3: main page 4: logout");
		String response = scan.nextLine();

		if (response.equals("1")) {
			// show all departments
			DepartmentService.showAllDepartment();
		} else if (response.equals("2")) {
			// show department by id
			DepartmentService.showDepartmentById(scan);
		} else if (response.equals("3")) {
			// show main page
			UserController.userPage(employee, scan);
		} else {
			// logout
			return;
		}
	}

	public static void myUserPageService(Employee employee, Scanner scan) {
		MyUserService.upateMyUser(employee, scan);

	}
}
