package javaSecondWeek;

public class Constructor {

	public static void main(String[] args) {
		Personel personel1=new Personel("Can", "123456789","Adana", 320.5);
		System.out.println(personel1.getName()+" "+personel1.getPhone()+" "+personel1.getAddress()+" "+personel1.getSalary());
	}

}
