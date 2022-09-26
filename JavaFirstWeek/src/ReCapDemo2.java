package javaFirstWeek;

public class ReCapDemo2 {
	public static void main(String[] args) {
		double [] myList= {1.5,5,4.6,7,8.4};
		double total=0;
		double max=myList[0];
		for(double number:myList) {
			if(max<number) {
				max=number;
			}
			total=total+number;
			System.out.println(number);
		}
		System.out.println("Total"+total);
		System.out.println("Biggest number"+max);
	}
}
