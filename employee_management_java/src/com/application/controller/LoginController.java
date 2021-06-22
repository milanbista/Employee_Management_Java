package com.application.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.application.entity.Employee;
import com.application.repo.EmployeeDatabase;

public class LoginController {

	public void login(Scanner scan) {
		System.out.println("Enter username: ");
		String username = scan.nextLine();
		System.out.println("Enter password: ");
		String password = scan.nextLine();

		//check if the employee exit
		Employee employee = LoginController.userAuthentication(username, password);
		if(employee == null) {
			System.out.println("username or password is incorrect");
		}
		else if(employee.getEmp_role().toUpperCase().equals("USER")){
			UserController.userPage(employee, scan);
		}
		else if(employee.getEmp_role().toUpperCase().equals("ADMIN")) {
			AdminController.adminPage(employee, scan);
	
		}

	}

	public static Employee userAuthentication(String username, String password) {

		for (Employee employee : EmployeeDatabase.employeeList) {
			if(employee.getEmp_username().equals(username) && employee.getEmp_password().equals(password)) {
				return employee;
			}
		}
		return null;
	}

}
