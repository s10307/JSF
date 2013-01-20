package domain;

public class Vehicles {

	private String vehicleName = ""; // private String firstName = "";
	private String vehicleCountryOfOrigin = ""; // private String lastName = "";
	private String vehicleClass = ""; // private String zipCode = "";
	private int avgArmor; // private String town = "";
	private int avgArmorPenetration;// private String pin = "";
	private double avgRateOfFire;
	private int stockEnginePower;
	private int yearOfProduction;// private Date dateOfBirth = new Date();

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleCountryOfOrigin() {
		return vehicleCountryOfOrigin;
	}

	public void setVehicleCountryOfOrigin(String vehicleCountryOfOrigin) {
		this.vehicleCountryOfOrigin = vehicleCountryOfOrigin;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public int getAvgArmor() {
		return avgArmor;
	}

	public void setAvgArmor(int avgArmor) {
		this.avgArmor = avgArmor;
	}

	public int getAvgArmorPenetration() {
		return avgArmorPenetration;
	}

	public void setAvgArmorPenetration(int avgArmorPenetration) {
		this.avgArmorPenetration = avgArmorPenetration;
	}

	public double getAvgRateOfFire() {
		return avgRateOfFire;
	}

	public void setAvgRateOfFire(double avgRateOfFire) {
		this.avgRateOfFire = avgRateOfFire;
		this.avgRateOfFire = Math.round(avgRateOfFire * 100) / 100;
	}

	public int getStockEnginePower() {
		return stockEnginePower;
	}

	public void setStockEnginePower(int stockEnginePower) {
		this.stockEnginePower = stockEnginePower;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

}
