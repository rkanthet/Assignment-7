import java.util.ArrayList;
import java.util.List;

public class OfferingList extends ArrayList {

	private OfferingIterator offeringIterator;
	private List<Offering> offeringList;

	public OfferingList() {
		offeringList = new ArrayList<>();
	}
	protected Trading trading;

	public ListIterator createIterator() {
		return new OfferingIterator(this.offeringList);
	}
}
