package com.application.service;

import java.util.Scanner;

import com.application.controller.AdminController;
import com.application.entity.Department;
import com.application.entity.Employee;
import com.application.repo.EmployeeDatabase;

public class DepartmentService {

	public static void updateDepartment(Employee employee,Department dep, Scanner scan) {

		System.out.println(
				"1: update manger id: \n 2: update location: \n 3: department page: \n 4: main menu: \n 5: logout: ");

		String response = scan.nextLine();
		switch (response) {
		case "1":
			// update manager id
			System.out.println("manger id: ");
			int manager_id = Integer.parseInt(scan.nextLine());
			dep.setManage_id(manager_id);
			break;

		case "2":
			// update location
			System.out.println("location: ");
			String location = scan.nextLine();
			dep.setDep_location(location);
			break;

		case "3":
			// department page
			AdminService.departmentPageService(null, scan);
			break;
		case "4":
			// main menu
			AdminService.departmentPageService(employee, scan);
			break;
		case "5":
			// logout
			return;

		default:
			break;
		}
	}

	public static Department validateDepartment(int dep_id) {
		for (Department dep : EmployeeDatabase.departmentList) {
			if (dep.getDep_id() == dep_id) {
				return dep;
			}
		}
		return null;
	}

	public static void addDepartment(Scanner scan) {
		System.out.println("department name: ");
		String department_name = scan.nextLine();
		System.out.println("department id: ");
		int department_id = Integer.parseInt(scan.nextLine());

		// should be a valid employee
		int manager_id = 0;
		boolean notValidManager = true;
		while (notValidManager) {
			System.out.println("manager id: ");
			manager_id = Integer.parseInt(scan.nextLine());
			if (DepartmentService.validateManagerId(manager_id)) {
				notValidManager = false;
			}
		}

		System.out.println("location: ");
		String location = scan.nextLine();

		EmployeeDatabase.departmentList.add(new Department(department_name, department_id, manager_id, location));
	}

	private static boolean validateManagerId(int manager_id) {
		for (Employee emp : EmployeeDatabase.employeeList) {
			if (emp.getEmp_id() == manager_id) {
				return true;
			}

		}
		return false;
	}

	public static void showAllDepartment() {
		for (Department dep : EmployeeDatabase.departmentList) {
			System.out.println(" department id: " + dep.getDep_id() + " department name: " + dep.getDep_name());
		}
	}

	public static void showDepartmentById(Scanner scan) {
		System.out.println("enter department id");
		int response_dep_id = Integer.parseInt(scan.nextLine());

		for (Department department : EmployeeDatabase.departmentList) {
			if (response_dep_id == department.getDep_id()) {
				System.out.println(
						" department id: " + department.getDep_id() + " department name: " + department.getDep_name());
			}
		}
	}

	public static void deleteDepartment(Scanner scan) {
		System.out.println("enter department id: ");
		int dep_id = Integer.parseInt(scan.nextLine());
		for (Department dep : EmployeeDatabase.departmentList) {
			if(dep_id == dep.getDep_id()) {
				EmployeeDatabase.departmentList.remove(dep);
				System.out.println("department deleted successfully!");
			}		
		}
		
	}
}
