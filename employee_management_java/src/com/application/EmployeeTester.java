package com.application;

import java.util.Scanner;

import com.application.controller.LoginController;
import com.application.entity.Department;
import com.application.entity.Employee;
import com.application.repo.EmployeeDatabase;

public class EmployeeTester {

	public static void main(String[] args) {
		
		LoginController loginController = new LoginController();
		Scanner scan = new Scanner(System.in);
		
		//adding default admin and department 
		EmployeeDatabase.employeeList.add(new Employee(1, "admin", "admin", "admin", "ADMIN"));
		EmployeeDatabase.departmentList.add(new Department(1, "MATH"));

		boolean shouldContinue = true;
		System.out.println("Welcome to IMCS");
		System.out.println("Default: Admin: admin  password: 123");
		while (shouldContinue) {
			System.out.println(" 1: login \n 2: exit");
			int response = Integer.parseInt(scan.nextLine());

			if (response == 1) {
				// go to login page
				loginController.login(scan);
			} else {
				shouldContinue = false;

			}
		}
	}
}
