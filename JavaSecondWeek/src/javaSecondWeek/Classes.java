package javaSecondWeek;

public class Classes {

	public static void main(String[] args) {
		DailyBalance today=new DailyBalance();
		today.add(5);
		today.add(25);
		today.sub(8);
		System.out.println(today.balance);

	}

}
