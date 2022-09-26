package javaSecondWeek;

public class Encapsulation {

	public static void main(String[] args) {
		Personel personel1=new Personel();
		personel1.setName("Can");
		personel1.setPhone("123456789");
		personel1.setAddress("Adana");
		personel1.setSalary(300.5);
		System.out.println(personel1.getName()+" "+personel1.getPhone()+" "+personel1.getAddress()+" "+personel1.getSalary());

	}

}
