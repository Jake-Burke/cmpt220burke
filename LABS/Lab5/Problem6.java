import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");	//asking for the size of the array
		int size = input.nextInt();
		
		double array[][] = new double[size][size];
			System.out.println("Enter the matrix:");
			
		 	for(int i = 0; i < size; i++){						//looping to get the numbers for the matrix
		   	    for(int j = 0; j < size; j++) {
		        	array[i][j] = input.nextInt();
		        	System.out.print("");
		            }
		  	}
		System.out.println("Matrix");							//displays the matrix
		  	for(int i = 0; i < size; i++){
		      	    for(int j = 0; j < size; j++){
		          	System.out.print(array[i][j]+" ");
		            }
		            System.out.println(" ");
		        }
		  	columnAverage(array);								//using the method
	}
	public static double[] columnAverage(double [][] array){

	    int size = array[0].length; 							//replacing with max inner array
	    double temp[] = new double[size];

	    for (int i = 0; i < array.length; i++){
	        for (int j = 0; j < array[i].length; j++){
	            temp[j] += array[i][j]/array.length;			//adding to temp array and then dividing by size
	        }
	    }

	    System.out.println("The average of each column is" +Arrays.toString(temp));	//Displaying the average
	    return temp;  
	}
}
