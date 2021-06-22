package com.application.entity;

public class Employee {

	private int emp_id;
	private String emp_name;
	private Department emp_department;
	private String emp_designation;
	private String emp_username;
	private String emp_password;
	private String emp_role;
	private int emp_phoneNumber;
	private String emp_address;

	public Employee() {

	}

	public Employee(int emp_id, String emp_name, String emp_username, String emp_password, String emp_role) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_username = emp_name;
		this.emp_password = emp_password;
		this.emp_role = emp_role;
	}

	public Employee(String emp_name, Department emp_department, String emp_designation, int emp_phoneNumber,
			String emp_address, String emp_role, String emp_usename, String emp_password) {
		this.emp_name = emp_name;
		this.emp_department = emp_department;
		this.emp_designation = emp_designation;
		this.emp_phoneNumber = emp_phoneNumber;
		this.emp_address = emp_address;
		this.emp_role = emp_role;
		this.emp_username = emp_usename;
		this.emp_password = emp_password;

	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Department getEmp_department() {
		return emp_department;
	}

	public void setEmp_department(Department emp_department) {
		this.emp_department = emp_department;
	}

	public String getEmp_designation() {
		return emp_designation;
	}

	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}

	public String getEmp_username() {
		return emp_username;
	}

	public void setEmp_username(String emp_username) {
		this.emp_username = emp_username;
	}

	public String getEmp_password() {
		return emp_password;
	}

	public void setEmp_password(String emp_password) {
		this.emp_password = emp_password;
	}

	public String getEmp_role() {
		return emp_role;
	}

	public void setEmp_role(String emp_role) {
		this.emp_role = emp_role;
	}

	public int getEmp_phoneNumber() {
		return emp_phoneNumber;
	}

	public void setEmp_phoneNumber(int emp_phoneNumber) {
		this.emp_phoneNumber = emp_phoneNumber;
	}

}
