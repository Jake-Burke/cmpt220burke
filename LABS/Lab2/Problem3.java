import java.util.Scanner;

public class Problem3 {
public static void main(String[]args) {
		
		System.out.print("Enter a lower number: ");			//Asking the user for a low number
		Scanner input1=new Scanner(System.in);
		int low=input1.nextInt();
		
		System.out.print("Enter a higher number: ");		//Asking the user for a high number
		Scanner input2=new Scanner(System.in);
		int high=input2.nextInt();
		
		int a =(int)(Math.random()*(high-low+1))+ low;		//taking a random number and multiplying it by the high-low+1 and then adding low
		int b =(int)(Math.random()*(high-low+1))+ low;
		int c =(int)(Math.random()*(high-low+1))+ low;
		
		System.out.println(a);								//Printing out the random number 3 times
		System.out.println(b);
		System.out.println(c);
		
		}
}
