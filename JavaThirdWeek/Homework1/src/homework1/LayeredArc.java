package homework1;

public class LayeredArc {

	public static void main(String[] args) {
		Customer customer=new  Customer();
		customer.setFirstName("Engin");
		CustomerManager customerManager=new CustomerManager(customer,new MilitaryCreditManager());
		customerManager.save();

		
	}
	

}
