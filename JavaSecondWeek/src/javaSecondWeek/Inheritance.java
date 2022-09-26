package javaSecondWeek;

public class Inheritance {

	public static void main(String[] args) {
		Employeer boss=new Employeer();
		boss.setAddress("Istanbul");
		boss.numberOfPers=12;
		System.out.println("Address:"+boss.getAddress()+"\nNumber of personel employed:"+boss.numberOfPers);

	}

}
