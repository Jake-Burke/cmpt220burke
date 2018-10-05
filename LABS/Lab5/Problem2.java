import java.util.Scanner;

public class Problem2 {
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");										//creating an array of 10 numbers
        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextDouble();

        System.out.println("The mean is: " + mean(numbers));						//using the methods
        System.out.println("The standard deviation is: " + deviation(numbers));

    }

    public static double deviation(double[] x) {									//method to get the deviation

        double mean = mean(x);
        double deviation = 0;
        for (int i = 0; i < x.length; i++) {
            deviation += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }
    public static double mean(double[] x) {											//method to get the mean

        double sum = 0;
        for (int i = 0; i < x.length; i++)
        	sum+=x[i];
        return sum/x.length;
    }
    public static void printArray(double[]x) {										//method to print the array
    	for (int i = 0; i < x.length; i++) {
    		System.out.println(x[i]+" ");
    		System.out.println();
    	}
    }
        	
    



}

