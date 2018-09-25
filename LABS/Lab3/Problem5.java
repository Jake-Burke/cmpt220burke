import java.util.Scanner;

public class Problem5 {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");				//asks for 3 numbers
		double a=input.nextDouble();
		System.out.print("Enter the second number: ");
		double b=input.nextDouble();
		System.out.print("Enter the third number: ");
		double c=input.nextDouble();
		
		System.out.print("The average is: "+average(a,b,c) );		//Displays the output and calls the average from the method
	}
	
	public static double average(double a, double b, double c) {	//method that takes 3 doubles
		return(a+b+c)/3;											//returns the total divided by 3 which is the average
		
	}

}
