package model;
import java.util.*;

public class Electric extends Car implements BatteryConsumption {

	private double batteryLife;
	private double kWForKm;
	private ChargeType chargeType;

	public Electric(String id, double basePrice, double salePrice, String brand, int model, double cc, double km, String licensePlate, String status, int doorsNumber, boolean polarized, String carType, double batteryLife, double kWForKm, String chargeType){

		super(id, basePrice, salePrice, brand, model, cc, km, licensePlate, status, doorsNumber, polarized, carType);
		this.batteryLife = batteryLife;
		this.kWForKm = kWForKm;

		if (chargeType.equals("1")){
			this.chargeType = ChargeType.FASTCHARGE;
		} else if (chargeType.equals("2")){
			this.chargeType = ChargeType.REGULARCHARGE;
		}


	}

	@Override
	public double calculateBatteryComsuption(){
		double totalComsuption = 0;
		return totalComsuption;
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