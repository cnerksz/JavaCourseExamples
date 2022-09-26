package javaSecondWeek;

public class Methods {

	public static void main(String[] args) {
		calculator(5,2,"add");
		calculator(5,2,"sub");
		calculator(5,2,"div");

	}
	public static void calculator(int number1,int number2,String operation) {
	int result=0;
		switch(operation) {
	case "add":
		result=number1+number2;
	break;
	case "sub":
		result=number1-number2;
	break;
	case "div":
		result=number1/number2;
	break;
	default:
		System.out.println("Please select one of them add,sub or div");;
	break;
	
	}
		if(result!=0)System.out.println("Result="+result);
		
	}

}
