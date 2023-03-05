
public class Minivan extends Vehicles {
	private int NumberOfSeats;
	private boolean AirConditionON;
	private boolean hasAutoDoors;
	private double costFor100Km;

	public int getNumberOfSeats() {
		return NumberOfSeats;
	}

	public void setAirConditionON_Off(boolean value) {
		this.AirConditionON = value;
	}

	public void setNumberOfSeats(int NumberOfSeats) {
		this.NumberOfSeats = NumberOfSeats;
	}

	public void setAirConditionON(boolean AirConditionON) {
		this.AirConditionON = AirConditionON;
	}

	public void sethasAutoDoors(boolean hasAutoDoors) {
		this.hasAutoDoors = hasAutoDoors;
	}

	@Override
	public String toString() {
		return super.toString() + "numberofseats: " + NumberOfSeats + ", airconditoinON: " + AirConditionON
				+ ", has auto doors: " + hasAutoDoors;
	}

	@Override
	public int compareTo(Vehicles obj) {
		return this.getowner().getName().compareTo(obj.getowner().getName());
	}

	@Override
	public double costFor100Km(PetroleumType type) {
		if (this.AirConditionON) {
			this.Fuelconsumption = this.Fuelconsumption + (this.Fuelconsumption * 0.2);
		}
		costFor100Km = (100 / this.Fuelconsumption) * type.getgasolinePrice();
		return costFor100Km;
	}

	@Override
	public void setAirConditionON() {
		this.setAirConditionON_Off(true);

	}

	@Override
	public void setAirConditionOff() {
		this.setAirConditionON_Off(false);
	}
}
