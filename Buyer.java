public class Buyer extends Person {
	private int productCategory;

	Buyer(int productCategory) {
		this.productCategory = productCategory;
	}

	public void showMenu() {
			theProductMenu.showMenu();


	}



	public ProductMenu CreateProductMenu() {
		System.out.println("Accessing Factory pattern to create the object");
		if(productCategory == 1){
			this.theProductMenu = new MeatProductMenu();
		} else{
			this.theProductMenu = new ProduceProductMenu();
		}
		return this.theProductMenu;
	}

}
