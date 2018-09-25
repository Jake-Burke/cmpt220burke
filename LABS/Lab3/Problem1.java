import java.util.Scanner;

public class Problem1 {
	public static void main(String[]args) {
		Scanner input =new Scanner(System.in);
		
		int even=0;															
		int total=0;
		int count=0;
		int number;
		float average;
		
		System.out.println("Enter some numbers, but enter 0 to stop: ");	//asking for input
		
		do {																//count the input and make total equal number
		number = input.nextInt();
		total+=number;
		count++;
		
		if (number%2==0) {													//if the number can be divided by 2 add an even
			even++;
			}
		}
		while (number !=0);													//only do this if number does not equal 0
		count--;
		average = total / count;											//calculate the average
		
		System.out.println("The amount of even numbers: "+ (even-1));		//show the output
		System.out.println("The total sum is: "+ total);
		System.out.println("The average is: "+ average);
		
	}

}
