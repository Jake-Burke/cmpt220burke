import java.util.Scanner;

public class Problem1 {
	public static void main(String[]args) {
		
		System.out.print("Enter a number: ");		//Asking the user for a number
		Scanner input1=new Scanner(System.in);
		double number1=input1.nextDouble();
		
		System.out.print("Enter a number: ");		//Asking the user for a second number
		Scanner input2=new Scanner(System.in);
		double number2=input2.nextDouble();
		
		//taking both numbers and comparing them and displaying the output
		
		System.out.println(number1 + " is less than " + number2 + " ? "+(number1<number2));
		System.out.println(number1 + " is less than or equal to " + number2 + " ? "+(number1<=number2));
		System.out.println(number1 + " is equal to " + number2 + " ? "+(number1==number2));
		System.out.println(number1 + " does not equal " + number2 + " ? "+(number1!=number2));
		System.out.println(number1 + " is greater than " + number2 + " ? "+(number1>number2));
		System.out.println(number1 + " is greater than or equal to " + number2 + " ? "+(number1>=number2));
		
	}

}
