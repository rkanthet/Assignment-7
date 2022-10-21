import java.util.List;

public class ProductIterator implements ListIterator {

	private ClassProductList classProductList;
	private List<Product> prodList;
	private int position=0;

	public ProductIterator(List<Product> productList) {
		this.prodList = productList;
	}


	@Override
	public boolean hasNext() {
		return position < prodList.size() && prodList.get(position) != null;
	}

	@Override
	public Product Next() {
		Product product = prodList.get(position);
		position += 1;
		return product;
	}

	@Override
	public void MoveToHead() {
		position=0;

	}

	@Override
	public void Remove() {

	}

}
