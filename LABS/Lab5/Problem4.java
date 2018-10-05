import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
	   public static void main (String[] args){ 
		   Scanner input=new Scanner(System.in);
		   System.out.print("How many numbers do you want in your arrays: ");	//asking for array size
		   int amount=input.nextInt();
		   int[]array1=new int[amount];
		   int[]array2=new int[amount];
		   
		   System.out.println("Enter some numbers for array 1 ");				//getting numbers for array 1
		   for(int i=0;i<amount;i++) {									
				int first=input.nextInt();
				array1[i]=first;
		   }
		   System.out.println("Enter some numbers for array 2 ");				//getting numbers for array 2
		   for(int i=0;i<amount;i++) {												
				int second=input.nextInt();
				array2[i]=second;
		   }
		   		
	        if (equal(array1, array2)) 											//using the method
	            System.out.println("The two arrays ARE identical"); 
	        else
	            System.out.println("The two arrays are NOT identical"); 
		   }
	     
	 public static boolean equal(int [] x, int [] y){ 							//checking the length
	        int j = x.length; 
	        int k = y.length; 
	          
	        if (j != k) 
	            return false; 
	   
	        
	        Arrays.sort(x); 													//sorts the arrays
	        Arrays.sort(y); 
	   
	         for (int i=0; i<j; i++) 											//compares the arrays
	            if (x[i] != y[i]) 
	                return false; 
	         										
	        return true; 
	    } 	 
	} 

