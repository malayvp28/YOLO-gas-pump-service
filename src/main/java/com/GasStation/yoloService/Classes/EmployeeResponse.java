package com.GasStation.yoloService.Classes;

public class EmployeeResponse {
	
	 private Long employee_id;
		
		
		private String name;
		

		private String userName;
		
		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		private String phone_number;
		
		private String message;

		public EmployeeResponse() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getEmployee_id() {
			return employee_id;
		}

		public void setEmployee_id(Long employee_id) {
			this.employee_id = employee_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	
		public String getPhone_number() {
			return phone_number;
		}

		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public EmployeeResponse(Long employee_id, String name, String userName, String phone_number, String message) {
			super();
			this.employee_id = employee_id;
			this.name = name;
			this.userName = userName;
			this.phone_number = phone_number;
			this.message = message;
		}

	
}
