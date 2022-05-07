package model;
import java.util.*;

public class Hybrid extends Car implements BatteryConsumption, FuelConsumption {

	private double gallonsCapacity;
	private double gallonsForKm;
	private double batteryLife;
	private double kWForKm;
	private ChargeType chargeType;
	private FuelType fuelType;

	public Hybrid(String id, double basePrice, double salePrice, String brand, int model, double cc, double km, String licensePlate, String status, int doorsNumber, boolean polarized, String carType, double batteryLife, double kWForKm, String chargeType, double gallonsCapacity, double gallonsForKm, String fuelType){

		super (id, basePrice, salePrice, brand, model, cc, km, licensePlate, status, doorsNumber, polarized, carType);
		this.gallonsCapacity = gallonsCapacity;
		this.kWForKm = kWForKm;
		this.batteryLife = batteryLife;
		this.gallonsForKm = gallonsForKm;

		if (chargeType.equals("1")){
			this.chargeType = ChargeType.FASTCHARGE;
		} else if (chargeType.equals("2")){
			this.chargeType = ChargeType.REGULARCHARGE;
		}

		if (fuelType.equals("1")){
			this.fuelType = FuelType.PREMIUM;
		} else if (fuelType.equals("2")){
			this.fuelType = FuelType.REGULAR;
		} else if (fuelType.equals("3")){
			this.fuelType = FuelType.DIESEL;
		}


	}

	@Override
	public double calculateFuelConsumption(){
		double totalComsuption = 0;
		return totalComsuption;
	}

	@Override
	public double calculateBatteryComsuption(){
		double totalComsuption = 0;
		return totalComsuption;
	}

	public double getGallonsCapacity(){
		return gallonsCapacity;
	}

	public void setGallonsCapacity(){
		this.gallonsCapacity = gallonsCapacity;
	}

	public double getGallonsForKm(){
		return gallonsForKm;
	}

	public void setGallonsForKm(){
		this.gallonsForKm = gallonsForKm;
	}

	public double getBatteryLife(){
		return batteryLife;
	}

	public void setBatteryLife(){
		this.batteryLife = batteryLife;
	}

	public double getkWForKm(){
		return kWForKm;
	}

	public void setkWForKm(){
		this.kWForKm = kWForKm;
	}

}