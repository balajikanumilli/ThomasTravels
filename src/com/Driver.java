package com;
//This will store the attributes of a driver and it's a pojo class
public class Driver {
	int driverId;
	String driverName;
	String category;
	double totalDistance;
	Driver driver;

	public Driver(int driverId, String driverName, String category, double totalDistance) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.category = category;
		this.totalDistance = totalDistance;
	}
	public Driver() {

	}

	public Driver(Driver driver) {
		this.driver=driver;
	}
	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", category=" + category
				+ ", totalDistance=" + totalDistance + "]";
	}

}
