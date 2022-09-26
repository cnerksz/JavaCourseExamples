package javaSecondWeek;

public class MethodOverloading {
	static int	result=0;
	public static void main(String[] args) {
	
	add(5);	
	System.out.println(result);	
	add(5,2);
	System.out.println(result);
	}
public static void add(int number) {
result+=number;
}
public static void add(int number1,int number2) {
	result+=number1+number2;
}
}
