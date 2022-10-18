package homework1;

public class CustomerManager {
	private Customer _customer=new Customer();
	ICreditManager iCreditManager;
	public CustomerManager(Customer customer,ICreditManager iCreditManager) {
		_customer=customer;
		this.iCreditManager=iCreditManager;
	}
	public void save() {
		iCreditManager.calculate();
		System.out.println("Musteri Kaydedildi"+" " +_customer.firstName);
	}
}
