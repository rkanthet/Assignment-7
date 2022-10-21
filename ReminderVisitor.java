public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	public void visitProduct(Product product) {
		System.out.println("Trading for this product "+product.getName()+" is "+product.getTrading());
	}

	public void visitTrading(Trading trading) {
		System.out.println("Printing the trading object, we can compare the dates with current date if trading object has data"+trading);
	}

	public void visitFacade(Facade facade) {
		System.out.println("Printing the product inside facade as expected"+ facade.getProduct());
	}

}
