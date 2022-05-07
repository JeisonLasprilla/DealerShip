package model;
import java.util.*;

public class DealerShip{

	private ArrayList <Vehicle> vehicles;
	
	public DealerShip(){
		vehicles = new ArrayList <Vehicle>();
	}

	public void addElectricCar(String id, double basePrice, double salePrice, String brand, int model, double cc, double km, String licensePlate, String status, int doorsNumber, boolean polarized, String carType, double batteryLife, double kWForKm, String chargeType, double priceSOAT, int yearSOAT, double coverageAmount, double priceReview, int yearReview, double gasReleased, double priceCard, int yearCard){
		vehicles.add(new Electric(id, basePrice, salePrice, brand, model, cc, km, licensePlate, status, doorsNumber, polarized, carType, batteryLife, kWForKm, chargeType)); 
		addDocuments(id, priceSOAT, yearSOAT, coverageAmount, priceReview, yearReview, gasReleased, priceCard, yearCard);
	}

	public void addFuelCar(String id, double basePrice, double salePrice, String brand, int model, double cc, double km, String licensePlate, String status, int doorsNumber, boolean polarized, String carType, double gallonsCapacity, double gallonsForKm, String fuelType, double priceSOAT, int yearSOAT, double coverageAmount, double priceReview, int yearReview, double gasReleased, double priceCard, int yearCard){
		vehicles.add(new Fuel(id, basePrice, salePrice, brand, model, cc, km, licensePlate, status, doorsNumber, polarized, carType, gallonsCapacity, gallonsForKm, fuelType)); 
		addDocuments(id, priceSOAT, yearSOAT, coverageAmount, priceReview, yearReview, gasReleased, priceCard, yearCard);
	}

	public void addHybridCar(String id, double basePrice, double salePrice, String brand, int model, double cc, double km, String licensePlate, String status, int doorsNumber, boolean polarized, String carType, double batteryLife, double kWForKm, String chargeType, double gallonsCapacity, double gallonsForKm, String fuelType, double priceSOAT, int yearSOAT, double coverageAmount, double priceReview, int yearReview, double gasReleased, double priceCard, int yearCard){
		vehicles.add(new Hybrid(id, basePrice, salePrice, brand, model, cc, km, licensePlate, status, doorsNumber, polarized, carType, batteryLife, kWForKm, chargeType, gallonsCapacity, gallonsForKm, fuelType)); 
		addDocuments(id, priceSOAT, yearSOAT, coverageAmount, priceReview, yearReview, gasReleased, priceCard, yearCard);
	}

	public void addMotorcicle(String id, double basePrice, double salePrice, String brand, int model, double cc, double km, String licensePlate, String status, double gallonsCapacity, double gallonsForKm, String motorcicleType, double priceSOAT, int yearSOAT, double coverageAmount, double priceReview, int yearReview, double gasReleased, double priceCard, int yearCard){
		vehicles.add(new Motorcicle(id, basePrice, salePrice, brand, model, cc, km, licensePlate, status, gallonsCapacity, gallonsForKm, motorcicleType)); 
		addDocuments(id, priceSOAT, yearSOAT, coverageAmount, priceReview, yearReview, gasReleased, priceCard, yearCard);
	}


	public void addDocuments(String id, double priceSOAT, int yearSOAT, double coverageAmount, double priceReview, int yearReview, double gasReleased, double priceCard, int yearCard){
		for (int i = 0; i < vehicles.size(); i++){

			if (vehicles.get(i).id.equals(id)){
				vehicles.get(i).documents[0] = new SOAT (priceSOAT, yearSOAT, coverageAmount);// soat
				vehicles.get(i).documents[1] = new Review (priceReview, yearReview, gasReleased);// revisión
				
				if (priceCard != -1 && yearCard != -1){
					vehicles.get(i).documents[2] = new OwnershipCard (priceCard, yearCard);
				}
			}
		}
	}


}