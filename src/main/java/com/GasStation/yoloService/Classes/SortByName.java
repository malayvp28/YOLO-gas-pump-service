package com.GasStation.yoloService.Classes;

import java.util.Comparator;

import com.GasStation.yoloService.Entity.Employee;


public class SortByName implements Comparator<Employee>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Employee a, Employee b)
    {
     
        		return a.getName().compareTo(b.getName());
        		
    
    }
}