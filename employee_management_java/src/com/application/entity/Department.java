package com.application.entity;

public class Department {

	private int dep_id;
	private String dep_name;
	private int manage_id;
	private String dep_location;

	public Department() {

	}

	public Department(String dep_name, int dep_id, int manager_id, String dep_location) {
		this.dep_name = dep_name;
		this.dep_id = dep_id;
		this.manage_id = manager_id;
		this.dep_location = dep_location;
	}

	public Department(int dep_id, String dep_name) {
		this.dep_id = dep_id;
		this.dep_name = dep_name;
	}

	public int getDep_id() {
		return dep_id;
	}

	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public int getManage_id() {
		return manage_id;
	}

	public void setManage_id(int manage_id) {
		this.manage_id = manage_id;
	}

	public String getDep_location() {
		return dep_location;
	}

	public void setDep_location(String dep_location) {
		this.dep_location = dep_location;
	}

}
