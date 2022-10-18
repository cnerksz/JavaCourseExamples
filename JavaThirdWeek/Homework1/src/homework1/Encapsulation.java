package homework1;

public class Encapsulation {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Engin");
		customer.setLastName("Demirog");
		customer.setNationalId("123456");
		System.out.println(customer.getId()+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getNationalId());
}

}
