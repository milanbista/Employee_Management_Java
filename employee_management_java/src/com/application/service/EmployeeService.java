package com.application.service;

import java.util.Scanner;

import com.application.entity.Department;
import com.application.entity.Employee;
import com.application.repo.EmployeeDatabase;

public class EmployeeService {

	public static void showAllEmployee() {
		System.out.println(" All employee");
		for (Employee emp : EmployeeDatabase.employeeList) {
			System.out.println(" employee name: " + emp.getEmp_name());
		}

	
	}

	public static void showEmployeeById(Scanner scan) {
		System.out.println(" enter employee id: ");
		int res_emp_id = Integer.parseInt(scan.nextLine());
		for (Employee emp : EmployeeDatabase.employeeList) {
			if (res_emp_id == emp.getEmp_id()) {
				System.out.println(" employee name: " + emp.getEmp_name());
			}
		}		
	}
	
	public static void addEmployee(Scanner scan) {
		System.out.println("name: ");
		String name = scan.nextLine();

		boolean invalidDep = true;
		int input_dep;
		Department to_be_added_department = null;
		;
		while (invalidDep) {
			System.out.println("enter valid department id: ");
			input_dep = Integer.parseInt(scan.nextLine());
			for (Department dep : EmployeeDatabase.departmentList) {
				if (dep.getDep_id() == input_dep) {
					invalidDep = false;
					to_be_added_department = dep;
				}
			}
		}
		System.out.println("designation: ");
		String designation = scan.nextLine();
		System.out.println("phone number: ");
		int phone_number = Integer.parseInt(scan.nextLine());
		System.out.println("address : ");
		String address = scan.nextLine();
		System.out.println("role : ");
		String role = scan.nextLine();
		System.out.println("username: ");
		String username = scan.nextLine();
		System.out.println("password: ");
		String password = scan.nextLine();

		EmployeeDatabase.employeeList.add(new Employee(name, to_be_added_department, designation, phone_number, address,
				role, username, password));
	}
	
	
	public static void updateEmployee(Employee employee, Scanner scan) {
		System.out.println("update employee");
		System.out.println(
				" 1: update department \n 2: update designation \n 3: update roles \n 4:employees page \n 5: main menu \n 6:logout");
		String response = scan.nextLine();
		switch (response) {
		case "1":
			// update department
			System.out.println("enter department id: ");
			int dep_id = Integer.parseInt(scan.nextLine());
			for (Department dep : EmployeeDatabase.departmentList) {
				if (dep.getDep_id() == dep_id) {
					employee.setEmp_department(dep);
					System.out.println("department update success!! new dept: " + dep.getDep_name());
					return;
				}
			}
			System.out.println("invalid department id");

			break;
		case "2":
			// update designation
			System.out.println("update designation: ");
			String new_designation = scan.nextLine();
			employee.setEmp_designation(new_designation);
			break;
		case "3":
			// update roles
			System.out.println("ente role: ");
			String role = scan.nextLine();
			employee.setEmp_role(role);
			break;
		case "4":
			// go to employees page
			break;
		case "5":
			// main menu
			break;

		case "6":
			// logout
			break;

		default:
			break;
		}
	}

	

}
