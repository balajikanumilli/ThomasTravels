package com;

import java.util.ArrayList;
import java.util.List;


public class Travel {
	
    public boolean isCarDriver(Driver driver) {
    	return driver.getCategory().equalsIgnoreCase("car");
    }
    
    public String retriveByDriverId(List<Driver> drivers,int id) {
    	for(Driver driver:drivers) {
    		if(driver.getDriverId()==id) {
    			return "Driver name is "+driver.getDriverName()+" belonging to the category"+driver.getCategory()+" travelled "+driver.getTotalDistance()+" KM so far.";
    		}
    	}
    	return "No Driver Found With This ID";
    }
    
    public int retriveCountOfDriver(List<Driver> drivers,String category) {
    	int countOfDrivers=0;
    	for(Driver driver:drivers)
    		if(driver.getCategory().equalsIgnoreCase(category))
    			countOfDrivers++;
    	return countOfDrivers;
    }
    public List<Driver> retriveByCategory(List<Driver> drivers,String category){
    	List<Driver> resultList=new ArrayList();
    	for(Driver driver:drivers)
    		if(driver.getCategory().equalsIgnoreCase(category))
    			resultList.add(driver);
		return resultList;
    }
    public Driver maximumDistanceTravelledByDriver(List<Driver> drivers) {
    	double highest=0;
    	Driver d=null;
    	for(Driver driver:drivers) {
    		if(driver.getTotalDistance()>highest) { 
    			highest=driver.getTotalDistance();
    			d=driver;
    		}
    	}
    	return d;
    }
}
