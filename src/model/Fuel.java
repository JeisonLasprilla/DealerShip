package model;
import java.util.*;

public class Fuel extends Car implements FuelConsumption{

	private double gallonsCapacity;
	private double gallonsForKm;
	private FuelType fuelType;
	
	public Fuel(String id, double basePrice, double salePrice, String brand, int model, double cc, double km, String licensePlate, String status, int doorsNumber, boolean polarized, String carType, double gallonsCapacity, double gallonsForKm, String fuelType){

		super (id, basePrice, salePrice, brand, model, cc, km, licensePlate, status, doorsNumber, polarized, carType);
		this.gallonsCapacity = gallonsCapacity;
		this.gallonsForKm = gallonsForKm;

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

}