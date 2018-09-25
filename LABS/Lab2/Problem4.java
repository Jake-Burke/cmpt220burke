import java.util.Scanner;

public class Problem4 {
public static void main(String[]args) {
		
		System.out.print("Enter first character: ");		//Asking the user for a character
		Scanner input1=new Scanner(System.in);
		char a= input1.next().charAt(0);
		
				
		System.out.print("Enter second character: ");		//Asking the user for a second character
		Scanner input2=new Scanner(System.in);
		char b= input2.next().charAt(0);
		
		System.out.println("Result Is: "+ (a+b));				//Adding both characters and displaying the sum
	}
}
