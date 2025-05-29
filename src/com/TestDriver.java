package com;

import java.util.ArrayList;
import java.util.List;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Travel mojoTravels=new Travel();
        Driver driver1=new Driver(1,"Srinivas","bus",300);
        
        boolean isCarDriver=mojoTravels.isCarDriver(driver1);
        System.out.println(isCarDriver);
        
        Driver driver2=new Driver(2,"Harish","Car",400);
        Driver driver3=new Driver(3,"Dinesh","Bike",340);
        
        List<Driver> driversList=new ArrayList();
        driversList.add(driver1);
        driversList.add(driver2);
        driversList.add(driver3);
        
        Travel uber=new Travel();
        System.out.println(uber.retriveByDriverId(driversList, 4));
        
        Driver driver=uber.maximumDistanceTravelledByDriver(driversList);
        System.out.println(driver);
        
        Travel rapido=new Travel();
        List<Driver> resultList=rapido.retriveByCategory(driversList, "Bike");
        System.out.println(resultList);
        
        
        
	}

}
