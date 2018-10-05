import java.util.Scanner;

public class Problem5 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");	//asking for the size of the array
		int size = input.nextInt();
		
		int array[][] = new int[size][size];
			System.out.println("Enter the matrix:");
			
		 	for(int i = 0; i < size; i++){						//looping to get the numbers for the matrix
		   	    for(int j = 0; j < size; j++) {
		        	array[i][j] = input.nextInt();
		        	System.out.print("");
		            }
		  	}
		System.out.println("The transpose of matrix");				//displays the matrix
		  	for(int i = 0; i < size; i++){
		      	    for(int j = 0; j < size; j++){
		          	System.out.print(array[i][j]+" ");
		            }
		            System.out.println(" ");
		        }
		  	
		 System.out.println("is ");								//switches the rows and columns
		  	for(int i = 0; i < size; i++){
		      	    for(int j = 0; j < size; j++){
		                System.out.print(array[j][i]+" ");
		            }
		            System.out.println(" ");
		    }
	  }
}

