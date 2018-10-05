import java.util.Scanner;

public class Problem1 {
	public static void main (String[] args){
		Scanner input =new Scanner(System.in);						
		double[] numbers = new double[10];								//creating array of 10
		
		System.out.print("Enter 10 numbers: ");
		
		for (int i=0; i<numbers.length;i++) {							//loop to get the 10 numbers
			numbers[i]=input.nextDouble();
		}
		System.out.println("The largest number is: "+max(numbers));		//implementing the method
	}
	public static double max(double[]array) {
		double max= array[0];											//method that gets the largest number
		for(double i: array) {
			if(i>max)
				max=i;
		}
		return max;
	}
	
}
