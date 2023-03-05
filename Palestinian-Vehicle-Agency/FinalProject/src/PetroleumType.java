
public class PetroleumType {
	public static final int DIESEL = 1;
	public static final int GASOLINE = 2;
	private double gasolinePrice;
	private double dieselPrice;

	public double getgasolinePrice() {
		return gasolinePrice;
	}

	public void setgasolinePrice(double gasolinePrice) {
		this.gasolinePrice = gasolinePrice;
	}

	public double getdieselPrice() {
		return dieselPrice;
	}

	public void setdieselPrice(double dieselPrice) {
		this.dieselPrice = dieselPrice;
	}

	@Override
	public String toString() {
		return "PetroleumType [gasolinePrice=" + gasolinePrice + ", dieselPrice=" + dieselPrice + "]";
	}

}
