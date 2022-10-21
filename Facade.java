import java.util.Scanner;

public class Facade {
	Scanner sc = new Scanner(System.in);
	private int UserType;
	private Product currProduct;


	public boolean login() {
		Login newLogin = new Login();
		newLogin.login();
		this.UserType = newLogin.getUserType();
		createUser(new UserInfoItem());
		return false;
	}

	public Product getProduct(){
		return currProduct;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void createUser(UserInfoItem userinfoitem) {
		System.out.println("What do you want to see? \n Press 1 for Meat \n Press 2 for Produce");
		int choice = Integer.parseInt(sc.nextLine());
		while(choice>2){
			System.out.println("Invalid choice please try again");
			choice = Integer.parseInt(sc.nextLine());
		}
		if(UserType == 0){
			Buyer buyer = new Buyer(choice);
			buyer.CreateProductMenu();
			buyer.showMenu();
		}else{
			Seller seller = new Seller(choice);
			seller.CreateProductMenu();
			seller.showMenu();
		}
		System.out.println("Accessing visitor pattern for product list");
		remind();
	}
	public void remind() {
		ReminderVisitor remind = new ReminderVisitor();
		ClassProductList CL = new ClassProductList();
		CL.accept(remind);
	}
	public void createProductList() {

	}

	public void attachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}
}
