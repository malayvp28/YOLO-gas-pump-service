package com.GasStation.yoloService.Controller;

import com.GasStation.yoloService.Entity.Admin;
import com.GasStation.yoloService.Entity.Customer;
import com.GasStation.yoloService.Entity.Dealer;
import com.GasStation.yoloService.Entity.Employee;
import com.GasStation.yoloService.Entity.Franchise;
import com.GasStation.yoloService.Entity.PublicQuery;
import com.GasStation.yoloService.Entity.UpdateDate;
import com.GasStation.yoloService.Repository.AdminRepo;
import com.GasStation.yoloService.Repository.*;
import com.GasStation.yoloService.Classes.AdminLogin;
import com.GasStation.yoloService.Classes.AdminResponse;
import com.GasStation.yoloService.Classes.CustomerInput;
import com.GasStation.yoloService.Classes.*;
import com.GasStation.yoloService.Classes.EmployeeDeleteRequest;
import com.GasStation.yoloService.Classes.Message;
import com.GasStation.yoloService.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")


public class Controller {
    @Autowired
    private CustomerService service;
    
    @Autowired
    private AdminRepo adminRepo;
    
    @Autowired
    private CustomerRepo customerRepo;
    
    @Autowired
    private DateRepo dateRepo;
    
    @Autowired
    private DealerRepo dealerRepo;
    
    @Autowired
    private QueryRepo queryRepo;
    
    @Autowired
    private EmployeeRepo employeeRepo;
    
    @Autowired
    private FranchiseRepo franchiseRepo;



    @RequestMapping(method = RequestMethod.GET,path="/")
    public String Home(){
        return "Welcome home";
    }

    
    
    
    
    //admin login api
    @RequestMapping(method = RequestMethod.POST,path="/admin/login")
    public ResponseEntity<?> adminLogin(@RequestBody AdminLogin admin){
    	
       Admin a=adminRepo.adminByPhoneNumber(admin.getPhoneNumber());
       
       if(a!=null && a.getPassword().equals(admin.getPassword()))
       {
    	   return new ResponseEntity<>( new AdminResponse(a.getAdmin_id(),a.getName(),a.getUsername(),a.getPhoneNumber(),"You are Login Successfully"), HttpStatus.OK);
    	  
       }
       else 
    	   return new ResponseEntity<>(new AdminResponse((long)-1,"","","","Your Credential Wroung !!"),HttpStatus.OK);
    }
    
    //admin sign up api
    
    @RequestMapping(method = RequestMethod.POST,path="/admin/create")
    public AdminResponse createAdmin(@RequestBody Admin admin){
    	try {
    		
    		Admin a=adminRepo.save(admin);
    		a.setUsername((a.getAdmin_id()+78)+""+a.getName().replaceAll(" ",""));
    		adminRepo.save(a);
    		
    		
    		return new AdminResponse(admin.getAdmin_id(),admin.getName(),admin.getUsername(),admin.getPhoneNumber(),"Admin Created Successfully.");
    		
    	}
    	catch(DataIntegrityViolationException e)
    	{
    		
    		return new AdminResponse((long)-1,"","","","Phone Number Already Used.");
    		
    	}
    	catch(Exception e)
    	{
    		return new AdminResponse((long)-1,"","","","Something went to wrong !!");
    	}
        
    }
    
    
    
    
    
    
    //get all admin
    @RequestMapping(method = RequestMethod.GET,path="/admin")
    public List<Admin> adminAll(){
        return adminRepo.findAll();
    }
    
    
    
    
    //all customer
    @RequestMapping(method=RequestMethod.GET,path="/customer/all")
    public List<Customer> allCustomer(){
    	List<Customer> data=new LinkedList<>();
        customerRepo.findAll().forEach(data::add);
    	return data;
    }
    
    //all customer sort by name
    @RequestMapping(method=RequestMethod.GET,path="/customer/all/name")
    public List<Customer> allCustomerSortByName(){
    	ArrayList<Customer> data=new ArrayList<>();
    	
        customerRepo.findAll().forEach(data::add);
        Comparator<Employee> compareByName = (Employee o1, Employee o2) -> o1.getName().compareTo( o2.getName() );
        
    	return data;
    }
    
    
    
    
    
    //add customer
    @RequestMapping(method=RequestMethod.POST,path="/customer/add")
    public Message addCustomer(@RequestBody CustomerInput customer) {
    	
    	
    	Customer c=customer.getC();
    	
    	
    	if(customer.getAdmin()!=null)
    	{
    		if(adminRepo.adminByUsername(customer.getAdmin())!=null)
    		{
    			
    			try {
    				
    		    	Customer cust=customerRepo.customerByCarNumber(c.getCar_number());
    		    	if(cust!=null)
    		    		return  new Message("Car already registerd");
    		    	else {
    		    	
    		    	
    		    	customerRepo.save(c);
    		    	return new Message("Customer added successfully.");
    		    	}
    		    	}
    		    	catch(Exception e)
    		    	{
    		    		return new Message("Something went to wroung!!"+e.getMessage());
    		    		
    		    	}	
    		}
    		else
    		{
    			return new Message("You Don't have access !!");
    		}
    	
    	}
    	else if(customer.getEmployee()!=null)
    	{
    		
    		if(employeeRepo.employeeByUsername(customer.getEmployee())!=null)
    		{
    			try {
    				
    		    	Customer cust=customerRepo.customerByCarNumber(c.getCar_number());
    		    	if(cust!=null)
    		    		return  new Message("Car already registerd");
    		    	else {
    		    	
    		    	
    		    	customerRepo.save(c);
    		    	return new Message("Customer added successfully.");
    		    	}
    		    	}
    		    	catch(Exception e)
    		    	{
    		    		return new Message("Something went to wroung!!");
    		    		
    		    	}	
    		}
    		else
    		{
    			return new Message("You Don't have access !!");
    		}
    	
    	}
    	else
    	{
    		return new Message("Something went to wroung!!");
    	}
    	
 }
    
    
    //Get Customer by id
    @RequestMapping(method=RequestMethod.GET,path="/customerById/{id}")
    public CustomerResponse getCustomerById(@PathVariable("id") Long id)
    
    {
    	Customer customer=customerRepo.customerById(id);
    	
    	if(customer!=null)
    	{
    		Dealer d=dealerRepo.dealerById(customer.getDealer());
    		Franchise f=franchiseRepo.franchiseById(customer.getFranchise());
    		Employee e=employeeRepo.employeeById(customer.getEmployee());
    		CustomerResponse c=new CustomerResponse(customer,d,e,f);
    		return c;
    		
    	}
    	
    	return null;
    }
    
    //save employee
    @RequestMapping(method=RequestMethod.POST,path="/employee/save")
    public Message addEmployee(@RequestBody Employee e)
    
    {
    	try {
    	Employee emp=	employeeRepo.save(e);
    	emp.setUsername(emp.getEmployee_id()+""+emp.getName().replaceAll(" ", ""));
    	employeeRepo.save(emp);
    		
    		
    	return new Message("Ok");
    	}
    	catch(Exception obj)
    	{
    		return new Message("Failed");
    	}
    }
    
    
    //get All Employee
    @RequestMapping(method=RequestMethod.GET,path="/employee/all")
    public List<Employee> allEmployee()
    {
    	return employeeRepo.findAll();
    }
    
    @RequestMapping(method=RequestMethod.POST,path="/employee/delete")
    public Message deleteEmployee(@RequestBody EmployeeDeleteRequest emp)
    
    {
    	
    	
    	try {
    		if(adminRepo.findById(emp.getAdmin_id())!=null) {
    		Employee e=employeeRepo.employeeById(emp.getEmployee_id());
    		
    		System.out.print(e);
    		employeeRepo.delete(e);
    		return new Message("Ok");
    		}
    		
    			return new Message("Failed");
    		
    	
    	}
    	catch(Exception obj)
    	{
    		return new Message("Failed");
    	}
    }
    
    //get queries
    
    @RequestMapping(method=RequestMethod.GET,path="query/get")
    public List<PublicQuery> getQueries(){
    	return queryRepo.findAll();
    }
    
    //save query
    @RequestMapping(method=RequestMethod.POST,path="query/add")
    public Message addQuery(@RequestBody PublicQuery q)
    {
    	try {
    		 queryRepo.save(q);
    		 return new Message("Ok");
    	}
    	catch(Exception e)
    	{
    		return new Message("Failed");
    	}
    	
  
    }
    @RequestMapping(method=RequestMethod.GET,path="query/update/{id}")
    public Message updateQuery(@PathVariable("id") Long id)
    {
    	try {
    		PublicQuery q=queryRepo.queryById(id);
    		q.setQuery_status("Solved");
    		queryRepo.save(q);
    		return new Message("Ok");
    		
    		 
    	}
    	catch(Exception e)
    	{
    		return new Message("Failed");
    	}
    	
  
    }
    
    @RequestMapping(method = RequestMethod.POST,path="/employee/login")
    public ResponseEntity<?> employeeLogin(@RequestBody Employee emp){
    	
       Employee a=employeeRepo.employeeByPhoneNumber(emp.getPhone_number());
       
       System.out.println(a);
       if(a!=null && a.getPassword().equals(emp.getPassword()))
       {
    	   return new ResponseEntity<>( new EmployeeResponse(a.getEmployee_id(),a.getName(),a.getUsername(),a.getPhone_number(),"You are Login Successfully"), HttpStatus.OK);
    	  
       }
       else 
    	   return new ResponseEntity<>(new AdminResponse((long)-1,"","","","Your Credential Wroung !!"),HttpStatus.OK);
    }
    
    
    
    @RequestMapping(method = RequestMethod.POST,path="/admin/add/service")
    public ResponseEntity<?> addService(@RequestBody ServiceRequest req){
    	
    	try {
          Customer c=customerRepo.customerById(req.getId());
          
          c.setExpiry_date(req.getExpiryDate());
          c.addLast_update_dates(req.getServiceDate());
          
          customerRepo.save(c);
          return new ResponseEntity<>(new Message("Your Service Updated Successfully !!"),HttpStatus.OK);
    	}
    	catch(Exception e)
    	{
    		 
    	}
       
      
    	   return new ResponseEntity<>(new Message("Somthing went to wroung !!"),HttpStatus.OK);
    }
    
  
    
    
    
    
    

   


}
