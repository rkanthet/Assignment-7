import java.util.List;

public class OfferingIterator implements ListIterator {

	private List<Offering> offerings;
	private int pos=0;

	public OfferingIterator(List<Offering> offerings){
		this.offerings = offerings;
	}

	@Override
	public boolean hasNext() {
		return pos < offerings.size() && offerings.get(pos) != null;
	}

	@Override
	public Offering Next() {
		Offering offering= offerings.get(pos);
		pos += 1;
		return offering;
	}

	@Override
	public void MoveToHead() {
		pos=0;
	}

	@Override
	public void Remove() {

	}
}
