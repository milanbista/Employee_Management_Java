package com.application.service;

import java.util.Scanner;

import com.application.EmployeeTester;
import com.application.controller.AdminController;
import com.application.controller.UserController;
import com.application.entity.Employee;

public class MyUserService {

	public static void upateMyUser(Employee employee, Scanner scan) {
		System.out
				.println("1: update address \n 2: update phone number \n 3: update password \n 4: main page \n logout");

		String response = scan.nextLine();
		switch (response) {
		case "1":
			// update address
			System.out.println("new address: ");
			String new_address = scan.nextLine();
			employee.setEmp_address(new_address);
			break;

		case "2":
			// update phone number
			System.out.println("new phone number: ");
			int new_ph_number = Integer.parseInt(scan.nextLine());
			employee.setEmp_phoneNumber(new_ph_number);
			break;

		case "3":
			// update password
			boolean passNotConfirmed = true;
			while (passNotConfirmed) {
				System.out.println(" new password: ");
				String new_pass = scan.nextLine();
				System.out.println(" confirm password: ");
				String confirm_pass = scan.nextLine();
				if (new_pass.equals(confirm_pass)) {
					employee.setEmp_password(new_pass);
					passNotConfirmed = false;
				} else {
					System.out.println("password didnot match");
				}
			}
			break;

		case "4":
			// go to main page
			if(employee.getEmp_role().toLowerCase().equals("admin")) {
				 AdminController.adminPage(employee, scan);
				
			}
			else if(employee.getEmp_role().toLowerCase().equals("user")) {
				UserController.userPage(employee, scan);
				
			}
			return;		

		case "5":
			// log out
			return;

		default:
			return;
		}
	}
}
