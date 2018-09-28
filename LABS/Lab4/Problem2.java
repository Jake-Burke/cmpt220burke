
public class Problem2 {
	public static void main(String[]args){
	    

	     char[][] matrix = new char [5][5];						//a 5x5 two dimensional array
	     
	     for (int i = 0; i < 5; i++){							//looping for rows and columns
	        for (int j = 0; j < 5; j++){	        	
	           int number = (int) (Math.random() * 26)+97;		//random number multiplying by 26 and then adding 97 for lowercase
	           
	           matrix[i][j] = (char) number; 					//display the table and convert the number to the letter
	           System.out.print(matrix[i][j] + " ");
	        }
	        System.out.println();								//print
	     }
	}

}
