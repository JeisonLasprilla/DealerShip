package model;
import java.util.*;

public class Motorcicle extends Vehicle implements FuelConsumption{

	private double gallonsCapacity;
	private double gallonsForKm;
	private MotorcicleType motorcicleType;

	public Motorcicle(String id, double basePrice, double salePrice, String brand, int model, double cc, double km, String licensePlate, String status, double gallonsCapacity, double gallonsForKm, String motorcicleType){

		super(id, basePrice, salePrice, brand, model, cc, km, licensePlate, status);
		this.gallonsCapacity = gallonsCapacity;
		this.gallonsForKm = gallonsForKm;

		if(motorcicleType.equals("1")){
			this.motorcicleType = MotorcicleType.STANDARD;
		} else if (motorcicleType.equals("2")){
			this.motorcicleType = MotorcicleType.SPORT;
		} else if (motorcicleType.equals("3")){
			this.motorcicleType = MotorcicleType.SCOOTER;
		} else if (motorcicleType.equals("4")){
			this.motorcicleType = MotorcicleType.CROOS;
		}
	}

	@Override
	public double calculateFuelConsumption(){
		double comsuption = 0;
		return comsuption;
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