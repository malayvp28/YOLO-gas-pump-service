package com.GasStation.yoloService.Classes;

public class EmployeeDeleteRequest {
	private Long admin_id;
	private Long  employee_id;
	public Long getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Long admin_name) {
		this.admin_id = admin_name;
	}
	public Long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}
	public EmployeeDeleteRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDeleteRequest(Long admin_name, Long employee_id) {
		super();
		this.admin_id = admin_name;
		this.employee_id = employee_id;
	}

}
