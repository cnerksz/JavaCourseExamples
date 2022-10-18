package homework2;

public class Interface {
public static void main(String[]args) {
	CustomerManager customerManager=new CustomerManager(new Worker(), new Worker());
	customerManager.add();
}
}
