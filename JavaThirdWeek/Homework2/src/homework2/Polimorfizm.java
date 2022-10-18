package homework2;

public class Polimorfizm {

	public static void main(String[] args) {
		Animal [] log=new Animal[] {new Cat(),new Fish()};
		for(Animal logger:log) {
		logger.Log();
		}

	}

}
