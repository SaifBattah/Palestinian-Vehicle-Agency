
public abstract class Vehicles implements Comparable<Vehicles>, Cloneable {
	protected String modelName;
	protected String ModelNo;
	protected String Brand;
	protected String engineType;
	protected double tunkSize;
	protected double Fuelconsumption;
	public Owner owner;
	double costFor100Km;
	double MovableDistance;

	public abstract double costFor100Km(PetroleumType type);

	public double MovableDistance() {
		return Fuelconsumption * tunkSize;
	}

	public abstract void setAirConditionON();

	public abstract void setAirConditionOff();

	public String getmodelName() {
		return modelName;
	}

	public double getMovableDistance() {
		return MovableDistance;
	}

	public void setmodelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelNo() {
		return ModelNo;
	}

	public void setModelNo(String ModelNo) {
		this.ModelNo = ModelNo;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String Brand) {
		this.Brand = Brand;
	}

	public String getengineType() {
		return engineType;
	}

	public void setengineType(String engineType) {
		this.engineType = engineType;
	}

	public double gettunkSize() {
		return tunkSize;
	}

	public void settunkSize(double tunkSize) {
		this.tunkSize = tunkSize;
	}

	public double getFuelconsumption() {
		return Fuelconsumption;
	}

	public void setFuelconsumption(double Fuelconsumption) {
		this.Fuelconsumption = Fuelconsumption;
	}

	public Owner getowner() {
		return owner;
	}

	public void setowner(Owner owner) {
		this.owner = owner;
	}

	public double getCostFor100Km() {
		return costFor100Km;
	}

	@Override
	public String toString() {
		return "Vehicles [modelName=" + modelName + ", ModelNo=" + ModelNo + ", Brand=" + Brand + ", engineType="
				+ engineType + ", tunkSize=" + tunkSize + ", Fuelconsumption=" + Fuelconsumption + ", owner=" + owner
				+ ", costFor100Km=" + costFor100Km + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		return (Vehicles) super.clone();
	}
}
