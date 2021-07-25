package com.GasStation.yoloService.Entity;

import java.sql.Blob;
import java.util.List;

import javax.persistence.*;

@Table
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private Long customer_id;

    
    private String name;

    @Column(unique=true)
    private String car_number;

    
    private String area;

//    contact No , Last Service , Franchise

   
    private String expiry_date;
 
    @OneToMany(targetEntity=UpdateDate.class ,cascade= CascadeType.ALL)
    @JoinColumn(name="fk",referencedColumnName="customer_id")
    private List<UpdateDate> last_update_dates;
   


	public Customer(String name, String car_number, String area, String expiry_date, List<UpdateDate> last_update_dates,
			String puc_status, String phone_number, Long dealer, Long employee, Long franchise,
			String vehical_front_photo, String vehical_back_photo, String status) {
		super();
		this.name = name;
		this.car_number = car_number;
		this.area = area;
		this.expiry_date = expiry_date;
		this.last_update_dates = last_update_dates;
		this.puc_status = puc_status;
		this.phone_number = phone_number;
		this.dealer = dealer;
		this.employee = employee;
		this.franchise = franchise;
		this.vehical_front_photo = vehical_front_photo;
		this.vehical_back_photo = vehical_back_photo;
		this.status = status;
	}





	public List<UpdateDate> getLast_update_dates() {
		return last_update_dates;
	}





	public void setLast_update_dates(List<UpdateDate> last_update_dates) {
		
		this.last_update_dates = last_update_dates;
		
	}


	public void addLast_update_dates(String s) {
		
		this.last_update_dates.add(new UpdateDate(s));
		
	}



	public String getPuc_status() {
		return puc_status;
	}



	






	private String puc_status;
    
   
    private String phone_number;
    
    
    private Long dealer;
    

    private Long employee;
    

    private Long franchise;
    
    @Column(columnDefinition="text")
    private String vehical_front_photo;
    
    @Column(columnDefinition="text")
    private String vehical_back_photo;
    
    private String status;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCar_number() {
		return car_number;
	}

	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String isPuc_status() {
		return puc_status;
	}

	public void setPuc_status(String puc_status) {
		this.puc_status = puc_status;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Long getDealer() {
		return dealer;
	}

	public void setDealer(Long dealer) {
		this.dealer = dealer;
	}

	public Long getEmployee() {
		return employee;
	}

	public void setEmployee(Long employee) {
		this.employee = employee;
	}

	public Long getFranchise() {
		return franchise;
	}

	public void setFranchise(Long franchise) {
		this.franchise = franchise;
	}

	public String getVehical_front_photo() {
		return vehical_front_photo;
	}

	public void setVehical_front_photo(String vehical_front_photo) {
		this.vehical_front_photo = vehical_front_photo;
	}
	
	public String getVehical_back_photo() {
		return vehical_back_photo;
	}

	public void setVehical_back_photo(String vehical_back_photo) {
		this.vehical_back_photo = vehical_back_photo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}





	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", car_number=" + car_number + ", area="
				+ area + ", expiry_date=" + expiry_date + ", last_update_dates=" + last_update_dates + ", puc_status="
				+ puc_status + ", phone_number=" + phone_number + ", dealer=" + dealer + ", employee=" + employee
				+ ", franchise=" + franchise + ", vehical_front_photo=" + vehical_front_photo + ", vehical_back_photo="
				+ vehical_back_photo + ", status=" + status + "]";
	}

	
    

	
	
    
    
    
    





}
