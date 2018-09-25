import java.util.Scanner;

public class Problem3 {
	public static void main (String[]args) {
		System.out.print("Enter a value in ounces: ");
		Scanner input =new Scanner(System.in);
		double answer = input.nextDouble();
		System.out.print(answer+ " ounces is equal to "+answer*28.3495 +" grams");
	}
}
