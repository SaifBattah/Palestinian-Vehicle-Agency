import java.util.*;
import java.io.*;

public class Driver {
	static ArrayList<Vehicles> list = new ArrayList<Vehicles>();

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		PetroleumType typeofpetrol = new PetroleumType();
		int choice = 0;
		do {
			System.out.println("Select One Of the Following: ");
			System.out.println(
					"1. Read the data about objects from the file “inputdata.txt” and store them in Arraylist.");
			System.out.println("2. Set prices of petroleum.");
			System.out.println("3. Print sorted order Vehicles in an ascending order based on costFor100Km.");
			System.out.println("4. Print sorted order Vehicles in an ascending order based on owner name .");
			System.out.println("5. Print sorted order Vehicles in an descending order based on vehicle brand.");
			System.out.println("6. Clone Vehicle without owner.");
			System.out.println("7. Turn air-condition on.");
			System.out.println("8. Write Output on the “output.txt” file after sort them.");
			System.out.println("9. Exit from System.");

			choice = input.nextInt();
			switch (choice) {
			case 1:
				read(input, typeofpetrol);
				System.out.println("Reading Proccess Done!");
				break;

			case 2:
				System.out.println("Enter Diesel Price: ");
				double dieselPrice = input.nextDouble();
				typeofpetrol.setdieselPrice(dieselPrice);

				System.out.println("Enter Gasoline Price: ");
				double gasolinePrice = input.nextDouble();
				typeofpetrol.setgasolinePrice(gasolinePrice);

				for (Vehicles ob : list) {
					ob.costFor100Km(typeofpetrol);
				}
				break;

			case 3:
				Collections.sort(list, new CostCompare());
				System.out.println("list sorting according to Cost: ");
				for (Vehicles ob : list) {
					System.out.println(ob.toString());
				}
				break;

			case 4:
				Collections.sort(list);
				System.out.println("list sorting according to Owner Name: ");
				for (Vehicles ob : list) {
					System.out.println(ob.toString());
				}
				break;

			case 5:
				Collections.sort(list, new BrandCompare());
				System.out.println("list sorting according to Brand: ");
				for (Vehicles ob : list) {
					System.out.println(ob.toString());
				}
				break;

			case 6:
				System.out.println("Select One From The List To Clone: ");
				int i = 1;
				for (Vehicles ob : list) {
					System.out.println(i + "." + ob.toString());
					i++;
				}
				int SelectedObject = input.nextInt();
				Vehicles SelectedVehicles = (Vehicles) list.get(SelectedObject);
				SelectedVehicles.setowner(null);
				System.out.println("The Cloned Vehicle: ");
				System.out.println(SelectedVehicles.toString());
				break;

			case 7:
				for (Vehicles ob : list) {
					ob.setAirConditionON();
				}
				break;

			case 8:
				Writee(typeofpetrol);
				System.out.println("Writing Proccess Done");
				break;

			case 9:
				break;
			}
		} while (choice != 9);
	}

	private static void read(Scanner input, PetroleumType typeofpetrol) throws FileNotFoundException {
		// input = new Scanner(new File("inputdata.txt"));
		File myFile = new File("inputdata.txt");
		input = new Scanner(myFile);
		while (input.hasNext()) {
			String newline = input.nextLine();
			String[] array = newline.toString().split(",");
			if (array[0] == "Car") {
				Car ob = new Car();
				ob.setmodelName(array[1]);
				ob.setModelNo(array[2]);
				ob.setBrand(array[3]);
				Owner CarOwner = new Owner();
				CarOwner.setName(array[4]);
				ob.setowner(CarOwner);
				ob.setengineType(array[5]);
				ob.settunkSize(Double.parseDouble(array[6].trim()));
				ob.setFuelconsumption(Double.parseDouble(array[7].trim()));
				ob.setNumberOfSeats(Integer.parseInt(array[8].trim()));
				list.add(ob);
			} else if (array[0] == "Minivan") {
				Minivan ob = new Minivan();
				ob.setmodelName(array[1]);
				ob.setModelNo(array[2]);
				ob.setBrand(array[3]);
				Owner MiniVanOwner = new Owner();
				MiniVanOwner.setName(array[4]);
				ob.setowner(MiniVanOwner);
				ob.setengineType(array[5]);
				ob.settunkSize(Double.parseDouble(array[6].trim()));
				ob.setFuelconsumption(Double.parseDouble(array[7].trim()));
				ob.setNumberOfSeats(Integer.parseInt(array[8].trim()));
				ob.sethasAutoDoors(Boolean.valueOf(array[9]));
				list.add(ob);
			} else if (array[0] == "Truck") {
				Truck ob = new Truck();
				ob.setmodelName(array[1]);
				ob.setModelNo(array[2]);
				ob.setBrand(array[3]);
				Owner TruckOwner = new Owner();
				TruckOwner.setName(array[4]);
				ob.setowner(TruckOwner);
				ob.setengineType(array[5]);
				ob.settunkSize(Double.parseDouble(array[6].trim()));
				ob.setFuelconsumption(Double.parseDouble(array[7].trim()));
				ob.setNumberOfSeats(Integer.parseInt(array[8].trim()));
				ob.setpower(Integer.parseInt(array[9].trim()));
				list.add(ob);
			}
		}
		input.close();
	}

	private static void Writee(PetroleumType typeofpetrol) throws FileNotFoundException {
		try {
			FileWriter FWriter = new FileWriter(new File("output.txt"), true);

			for (Vehicles Typeofvehicleis : list) {
				if (Typeofvehicleis instanceof Car) {
					Car ob = (Car) Typeofvehicleis;
					FWriter.write("model Name: " + ob.getmodelName() + ", Brand: " + ob.getBrand() + ", Owner Name: "
							+ ob.getowner().getName() + ", Engine Type: " + ob.getengineType() + ", Tank Size: "
							+ ob.gettunkSize() + ", Fuel Consumption: " + ob.getFuelconsumption()
							+ ", Number Of Seats: " + ob.getNumberOfSeats() + ", Movable Distance: "
							+ ob.MovableDistance() + " km , Cost for 100 Km: " + ob.costFor100Km(typeofpetrol) + " NIS"
							+ "\n");
				} else if (Typeofvehicleis instanceof Minivan) {
					Minivan ob = (Minivan) Typeofvehicleis;
					FWriter.write("model Name: " + ob.getmodelName() + ", Brand: " + ob.getBrand() + ", Owner Name: "
							+ ob.getowner().getName() + ", Engine Type: " + ob.getengineType() + ", Tank Size: "
							+ ob.gettunkSize() + ", Fuel Consumption: " + ob.getFuelconsumption()
							+ ", Number Of Seats: " + ob.getNumberOfSeats() + ", Movable Distance: "
							+ ob.MovableDistance() + " km , Cost for 100 Km: " + ob.costFor100Km(typeofpetrol) + " NIS"
							+ "\n");
				} else if (Typeofvehicleis instanceof Truck) {
					Truck ob = (Truck) Typeofvehicleis;
					FWriter.write("model Name: " + ob.getmodelName() + ", Brand: " + ob.getBrand() + ", Owner Name: "
							+ ob.getowner().getName() + ", Engine Type: " + ob.getengineType() + ", Tank Size: "
							+ ob.gettunkSize() + ", Fuel Consumption: " + ob.getFuelconsumption()
							+ ", Number Of Seats: " + ob.getNumberOfSeats() + ", Movable Distance: "
							+ ob.MovableDistance() + " km , Cost for 100 Km: " + ob.costFor100Km(typeofpetrol) + " NIS"
							+ "\n");
				}
			}
			FWriter.close();
		} catch (IOException exep) {
			exep.printStackTrace();
		}
	}
}
