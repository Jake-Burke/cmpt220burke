import java.util.Scanner;

public class Problem2 {
public static void main(String[]args) {
		
		System.out.print("Enter a number for the month (1-12): ");		//Asking the user for a number that represents a month
		Scanner input=new Scanner(System.in);
		int month=input.nextInt();
		
		if (month==1)											// When Month equals a number print out that month
			System.out.println("January");
		else if (month==2)
			System.out.println("February");	
		else if (month==3)
			System.out.println("March");
		else if (month==4)
			System.out.println("April");
		else if (month==5)
			System.out.println("May");
		else if (month==6)
			System.out.println("June");
		else if (month==7)
			System.out.println("July");
		else if (month==8)
			System.out.println("August");
		else if (month==9)
			System.out.println("September");
		else if (month==10)
			System.out.println("October");
		else if (month==11)
			System.out.println("November");
		else if (month==12)
			System.out.println("December");
		
	}
}