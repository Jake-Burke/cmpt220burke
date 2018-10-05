import java.util.Scanner;

public class Problem7 {
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
	                       
	                      
	        if (isUpperTriangular(array)) 							//implementing the method
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
	    } 
	
	  
	    public static Boolean isUpperTriangular(double[][]array) //method that checks for upper triangular
	    { 
	        for (int i = 1; i < array.length ; i++) 
	            for (int j = 0; j < i; j++) 
	                if (array[i][j] != 0) 
	                    return false; 
	        return true; 
	    }  
}
	

	  
			
