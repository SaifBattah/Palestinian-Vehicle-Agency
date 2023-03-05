import java.util.Comparator;

public class BrandCompare implements Comparator<Vehicles> {

	@Override
	public int compare(Vehicles ob1, Vehicles ob2) {
		return ob1.getBrand().compareTo(ob2.getBrand());
	}

}
