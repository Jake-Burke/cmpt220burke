import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);								//inputing a scanner
		
		System.out.print("Please enter a positive integer: ");						//asking user for positive integer
		int number = input.nextInt();
	
		System.out.print("The smallest factors of " + number + " are: ");	//shows all smallest factors in decreasing order
		StackOfIntegers stack = new StackOfIntegers(); 

		smallestFactors(number, stack);										//implementing the method

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	
	public static void smallestFactors(int number, StackOfIntegers stack) {	//method to get smallest factor
		int i = 2;	//prime factor
		
		while (number / i != 1){ 
			if (number % i == 0) {
				stack.push(i);
				number /= i;
			}
			else
				i++;
		}
		stack.push(number);
	}
}

