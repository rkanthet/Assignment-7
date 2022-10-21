public class Product {

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	private String name;
	private String type;

	public Product(String name, String type) {
		this.name = name;
		this.type = type;
	}

	private ClassProductList classProductList;

	private Trading trading;

	public Trading getTrading() {
		return this.trading;
	}
}
