package ui; //Paquete
import java.util.*; //Scanner
import model.DealerShip;

public class Main{

	private DealerShip a;

	static Scanner sc = new Scanner(System.in); // sc

	public Main(){
		a = new DealerShip();
	}

	public static void main (String[] args){

		Main mainDealerShip= new Main();

		String option = "0";
		
		do{
			option = mainDealerShip.showMenu();
			mainDealerShip.executeOperation(option);
			
		}while (!option.equals("0"));
	}

	public String showMenu(){
		System.out.println( "\n(1) Register vehicle"+
							"\n(2) Calculate sale price"+
							"\n(3) Information vehicles"+
							"\n(4) Show documents"+
							"\n(5) Show parking"+
							"\n(6) Information parking"+
							"\n(0) Exit\n"
							);
		String option = sc.nextLine();
		return option;
	}

	public void executeOperation(String option) {
		
		switch(option) {

		case "1":
			createVehicle();

		break;
		
		case "2":
			//
		break;

		case "3":
			//
		break;

		case "4":
			//
		break;

		case "5":
			//
		break;

		case "6":
			//
		break;		

		case "0":
			System.out.println("Bye!");
		break;

		default:
			System.out.println("ERROR\nTry again");
		break;
		
		}
	}


	public String createVehicle(){

		//Creating documents

		System.out.println("\n\tDocuments\n");
		System.out.println("\nSOAT\n");
		System.out.println("Price:");
		double priceSOAT = sc.nextDouble();
		sc.nextLine();
		System.out.println("Year:");
		int yearSOAT = sc.nextInt();
		sc.nextLine();
		System.out.println("Coverage amount:");
		double coverageAmount = sc.nextDouble();

		System.out.println("\nTechnical-mechanical review\n");
		System.out.println("Price:");
		double priceReview = sc.nextDouble();
		sc.nextLine();
		System.out.println("Year:");
		int yearReview = sc.nextInt();
		sc.nextLine();
    	System.out.println("Gas released:");
    	double gasReleased = sc.nextDouble();
		sc.nextLine();

		System.out.println("\nOwnership Card\n");
    	System.out.println("has:\n (1)Yes\n (2)No");
    	String cardType = sc.nextLine();


    	double priceCard = -1;
    	int yearCard = -1;	
	    	if (cardType.equals("1")){

	    			System.out.println("Price:");
					priceCard = sc.nextDouble();
					sc.nextLine();
					System.out.println("Year:");
					yearCard = sc.nextInt();
					sc.nextLine();

	    	} else {
	    		System.out.println("Don't buy stolen\n Make sure you have an ownership card");
			}


		//Star creating the vehicle

		System.out.println("\n\tVehicle information\n");

		System.out.println("Vehicle status:\n (1) New\n (2)Used");
		String status = sc.nextLine();  //enum Status

		System.out.println("ID:");
		String id = sc.nextLine();
		id = id.toLowerCase();

		System.out.println("Base price:");
		double basePrice = sc.nextDouble();
		sc.nextLine();

		System.out.println("Sale price:");
		double salePrice = sc.nextDouble();
		sc.nextLine();

		System.out.println("Brand:");
		String brand = sc.nextLine();
		brand = brand.toLowerCase();

		System.out.println("Model:");
		int model = sc.nextInt();
		sc.nextLine();

		System.out.println("Cubic capacity:");
		double cc = sc.nextDouble();
		sc.nextLine();

		System.out.println("Kilometers:");
		double km = sc.nextDouble();
		sc.nextLine();

		System.out.println("License Plate:");
		String licensePlate = sc.nextLine();
		licensePlate = licensePlate.toUpperCase();


		//For type

		System.out.println("Select a vehicle type:\n"+
							" (1) Car\n"+
							" (2) Motorcicle\n"
							);
		String vehicleType = sc.nextLine();


		double gallonsCapacity = 0;
		double gallonsForKm = 0;
		switch (vehicleType){

			case "1": //car

				System.out.println("Select a car type:\n"+ //car type
					" (1) Pickup\n"+
					" (2) Sedan\n"
					);
				String carType = sc.nextLine(); //Enum car type

				System.out.println("Battery life: ");
				int doorsNumber = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Polarized:\n"+
									" (1) Yes\n"+
									" (2) No\n"
									);

				String polarizedAsString = sc.nextLine();
				boolean polarized = false;
				if (polarizedAsString.equals("1")){
					polarized = true;
				}

				System.out.println("Select a car template:\n"+
									" (1) Fuel\n"+
									" (2) Electric\n"+
									" (3) Hybrid\n"
									);	
				String carTemplate = sc.nextLine(); //Daughter classes

				double batteryLife = 0;
				double kWForKm = 0;
				String chargeType = "";
				String fuelType = "";

				if (carTemplate.equals("1") || carTemplate.equals("3")){	//Fuel

					System.out.println("Gallons capacity: ");
					gallonsCapacity = sc.nextDouble();
					sc.nextLine();
					System.out.println("Gallons/Kilometer: ");
					gallonsForKm = sc.nextDouble();
					sc.nextLine();

					System.out.println("Select a fuel type:\n"+
										" (1) Premium\n"+
										" (2) Regular\n"+
										" (3) Diesel\n"
										);
					fuelType = sc.nextLine();	//Enum fuel type

					if (carTemplate.equals("1")){ //Add fuel car
					a.addFuelCar(id, basePrice, salePrice, brand, model, cc, km, licensePlate, status, doorsNumber, polarized, carType, gallonsCapacity, gallonsForKm, fuelType, priceSOAT, yearSOAT, coverageAmount, priceReview, yearReview, gasReleased, priceCard, yearCard);
					}
				} 

				if (carTemplate.equals("2") || carTemplate.equals("3")){	//Battery

					System.out.println("Battery life: ");
					batteryLife = sc.nextDouble();
					sc.nextLine();
					System.out.println("kilowatts/Kilometer: ");
					kWForKm = sc.nextDouble();
					sc.nextLine();


					System.out.println("Select a fuel type:\n"+
										" (1) Fast charge\n"+
										" (2) Regular charge\n"
										);
					chargeType = sc.nextLine();	//Enum charge type
					if (carTemplate.equals("2")){ //Add Electric car
					a.addElectricCar(id, basePrice, salePrice, brand, model, cc, km, licensePlate, status, doorsNumber, polarized, carType, batteryLife, kWForKm, chargeType, priceSOAT, yearSOAT, coverageAmount, priceReview, yearReview, gasReleased, priceCard, yearCard);
					}
				}

				if (carTemplate.equals("3")){ //Add Hybric car
					a.addHybridCar(id, basePrice, salePrice, brand, model, cc, km, licensePlate, status, doorsNumber, polarized, carType, batteryLife, kWForKm, chargeType, gallonsCapacity, gallonsForKm, fuelType, priceSOAT, yearSOAT, coverageAmount, priceReview, yearReview, gasReleased, priceCard, yearCard);
				}

			break;

			case "2": //Motorcicle

				System.out.println("Gallons capacity: ");
				gallonsCapacity = sc.nextDouble();
				sc.nextLine();
				System.out.println("Gallons/Kilometer: ");
				gallonsForKm = sc.nextDouble();
				sc.nextLine();

				String motorcicleType = "0";
				System.out.println("Select a motorcicle type:\n"+
									" (1) Standard\n"+
									" (2) Sport\n"+
									" (3) Scooter\n"+
									" (4) Croos\n"
									);
				motorcicleType = sc.nextLine(); //Enum motorcicle type

				a.addMotorcicle(id, basePrice, salePrice, brand, model, cc, km, licensePlate, status, gallonsCapacity, gallonsForKm, motorcicleType, priceSOAT, yearSOAT, coverageAmount, priceReview, yearReview, gasReleased, priceCard, yearCard);

			break;

			default:
				System.out.println("Please choose one option");
			break;
		}

		return "¡Vehicle was created!";

	}

	/**
	* Descripción: ¿qué hace mi método? (concisa, un par de líneas)<br>
		* <b> pre:<b> ¿cuáles son las condiciones sobre las variables globales? --> si hay una condición sobre var glob. <br>
		* <b> pos:<b> ¿Cuales fueron los cambios sobre las variables globales? --> si ocurrio un cambio cn var glob.
		* @param <nombre_par> <tipo>, condiciones sobre el parametro --> si tiene
		* @return <nombre_var> <tipo>, informacion sobre variable de retorno --> retorno
	*/
}