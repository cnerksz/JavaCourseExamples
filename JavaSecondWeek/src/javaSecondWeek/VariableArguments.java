package javaSecondWeek;

public class VariableArguments {

	public static void main(String[] args) {
	int biggest=biggestNumber(5,23,45,8,9,4);
	System.out.println(biggest);

	}
	public static int biggestNumber(int... numbers) {
		int biggest=numbers[0];
		for(int number:numbers) {
			if(number>biggest)biggest=number;
		}
		return biggest;
	
	}
}
