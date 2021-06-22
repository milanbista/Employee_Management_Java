package com.application.service;

import java.util.Scanner;

import com.application.controller.AdminController;
import com.application.entity.Department;
import com.application.entity.Employee;

public class AdminService {

	public static void employeePageService(Employee employee, Scanner scan) {
		System.out.println(
				" 1: show all employee \n 2: show employee by id \n 3: update employee \n 4: add employee \n 5: delete employee \n 6: main page \n 7: logout");
		String response = scan.nextLine();

		switch (response) {
		case "1":
			// show all employee
			EmployeeService.showAllEmployee();
			break;

		case "2":
			// show employee by id
			EmployeeService.showEmployeeById(scan);
			break;

		case "3":
			// update employee
			EmployeeService.updateEmployee(employee, scan);
		case "4":
			// add employee
			EmployeeService.addEmployee(scan);
			break;

		case "5":
			// delete employee
			break;

		default:
			break;
		}
	}

	public static void departmentPageService(Employee employee, Scanner scan) {
		System.out.println(
				"1: show all department: \n 2: update department \n 3: add department: \n 4: delete department: \n 5: main page: \n 6: logout: ");
		String response = scan.nextLine();
		switch (response) {
		case "1":
			// show all department
			DepartmentService.showAllDepartment();
			break;
		case "2":
			// update department
			System.out.println("ender department id: ");
			int dep_id = Integer.parseInt(scan.nextLine());
			Department dep = DepartmentService.validateDepartment(dep_id);
			if (dep != null) {
				DepartmentService.updateDepartment(employee, dep, scan);
			} else {
				System.out.println("wrong department");
			}
			break;
		case "3":
			// add department
			DepartmentService.addDepartment(scan);
			break;
		case "4":
			// delete department
			DepartmentService.deleteDepartment(scan);
			break;
		case "5":
			// main page
			AdminController.adminPage(employee, scan);
			break;
		case "6":
			// logout
			return;
		default:
			break;
		}

	}

	public static void myUserPageService(Employee employee, Scanner scan) {

		MyUserService.upateMyUser(employee, scan);
	}

}
