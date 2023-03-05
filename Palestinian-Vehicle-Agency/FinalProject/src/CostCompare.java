import java.util.Comparator;

public class CostCompare implements Comparator<Vehicles> {

	@Override
	public int compare(Vehicles ob1, Vehicles ob2) {
		Double ob1Cost = ob1.getCostFor100Km();
		Double ob2Cost = ob2.getCostFor100Km();
		return ob1Cost.compareTo(ob2Cost);
	}

}
