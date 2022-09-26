package javaFirstWeek;

public class VowelsAndConsonant {

	public static void main(String[] args) {
		char letter = 'A';

		switch (letter) {

		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(letter+" is consonant");
			break;
		default:
			System.out.println(letter+" is vowel");

		}
}



	

}
