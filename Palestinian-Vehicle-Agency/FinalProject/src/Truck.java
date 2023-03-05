
public class Truck extends Vehicles {
	private boolean AirConditionON;
	private int power;
	private int NumberOfSeats;

	public int getNumberOfSeats() {
		return NumberOfSeats;
	}

	public void setAirConditionON_Off(boolean value) {
		AirConditionON = value;
	}

	public double costFor100Km(PetroleumType type) {
		if (AirConditionON) {
			Fuelconsumption = Fuelconsumption + (Fuelconsumption * 0.2);
		}
		costFor100Km = (100 / Fuelconsumption) * type.getdieselPrice();
		return costFor100Km;
	}

	public void setpower(int power) {
		this.power = power;
	}

	public void setNumberOfSeats(int NumberOfSeats) {
		this.NumberOfSeats = NumberOfSeats;
	}

	@Override
	public String toString() {
		return super.toString() + ", airConditionOn: " + AirConditionON + ", power " + power + ", numberOfSeats: "
				+ NumberOfSeats;
	}

	public void setAirConditionON(boolean AirConditionON) {
		this.AirConditionON = AirConditionON;
	}

	public void setAirConditionON() {
		this.setAirConditionON_Off(true);
	}

	@Override
	public void setAirConditionOff() {
		this.setAirConditionON_Off(false);

	}

	public int compareTo(Vehicles obj) {
		return this.getowner().getName().compareTo(obj.getowner().getName());
	}

}
