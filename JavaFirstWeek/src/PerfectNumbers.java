package javaFirstWeek;

public class PerfectNumbers {

	public static void main(String[] args) {
		int number = 6;
		int total = 0;

		if (number < 0) {
			System.out.println("Null number");
			return;
		}

		if (number == 0) {
			System.out.println("Number isn't perfect number");
			return;
		}
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}

		}
		if (total == number) {
			System.out.println("Number is perfect number");

		} else {
			System.out.println("Number isn't perfect number");

		}

	

	}

}
