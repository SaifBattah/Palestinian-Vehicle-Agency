
public class Car extends Vehicles {
	private int NumberOfSeats;
	private boolean AirConditionON;

	@Override
	public String toString() {
		return "Car [NumberOfSeats=" + NumberOfSeats + ", AirConditionON=" + AirConditionON + "]";
	}

	public void setAirConditionON_Off(boolean value) {
		this.AirConditionON = value;
	}

	@Override
	public int compareTo(Vehicles obj) {
		return this.getowner().getName().compareTo(obj.getowner().getName());

	}

	@Override
	public double costFor100Km(PetroleumType type) {
		if (this.AirConditionON) {
			this.Fuelconsumption = this.Fuelconsumption + (this.Fuelconsumption * 0.1);
		}
		costFor100Km = (100 / this.Fuelconsumption) * type.getgasolinePrice();
		return costFor100Km;
	}

	public int getNumberOfSeats() {
		return NumberOfSeats;
	}

	public void setNumberOfSeats(int NumberOfSeats) {
		this.NumberOfSeats = NumberOfSeats;
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
