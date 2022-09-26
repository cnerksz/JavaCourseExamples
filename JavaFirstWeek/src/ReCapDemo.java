package javaFirstWeek;

public class ReCapDemo {
	public static void main(String[] args) {
		int number1=25;
		int number2=85;
		int number3=10;
		int biggest=number1;
		if(number2>biggest)biggest=number2;
		else if(number3>biggest)biggest=number3;
		System.out.println(biggest);
		
	}
}
