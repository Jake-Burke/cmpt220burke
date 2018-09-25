import java.util.Scanner;

public class Problem4 {
	public static void main (String[]args) {
		System.out.print("Enter the Mass in Kilograms: ");
		Scanner input =new Scanner(System.in);
		double answer = input.nextDouble();
		double c= answer*299972458*299972458;
		System.out.print("Energy = "+c);
	}
}
