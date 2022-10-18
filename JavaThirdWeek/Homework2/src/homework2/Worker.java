package homework2;

public class Worker implements IWorkable,IEatable {

	@Override
	public void work() {
		System.out.println("Our worker has 9-17 work hours");
		
	}

	@Override
	public void eat() {
		System.out.println("We pays our workers eat prices");
		
		
	}

}
