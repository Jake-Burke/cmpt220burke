import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = randomArray();							//using the method
		
		System.out.print("Please enter the index of the array: ");		//asking user for index of array
		
		try {
			// Display the corresponding element value
			System.out.println("The corresponding element value is: " + array[input.nextInt()]);	//displays corresponding element value
		}
		catch (ArrayIndexOutOfBoundsException ex) {				//catch if the number is over 100
			System.out.println("Out of Bounds");
		}
	}

	
	public static int[] randomArray() {							//Array of 100 random integers
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}
