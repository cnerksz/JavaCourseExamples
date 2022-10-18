package homework1;

public class Referance {

	public static void main(String[] args) {
	int sayi1=10,sayi2=20;
	sayi1=sayi2;
	sayi2=15;
	System.out.println(sayi1);
	int[] sayi3= {10},sayi4= {20};
	sayi3=sayi4;
	sayi4[0]=15;
	System.out.println(sayi3[0]);

	}

}
