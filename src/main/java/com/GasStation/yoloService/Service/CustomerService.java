package com.GasStation.yoloService.Service;

import com.GasStation.yoloService.Entity.Customer;
import com.GasStation.yoloService.Entity.Employee;
import com.GasStation.yoloService.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired()
    private CustomerRepo customerRepo;

    public String saveData(Customer c){
        this.customerRepo.save(c);
        return "done";

    }
    public List<Customer> getAllData(){
        List<Customer> data=new LinkedList<>();
        customerRepo.findAll().forEach(data::add);

        System.out.println(data+" ");
        return data;
    }
}


