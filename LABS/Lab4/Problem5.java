import java.util.Arrays;
import java.util.Random;

public class Problem5 {
	  public static void main(String[] args) {
		  int sum = 0;
	        int average = 0;
	 
	        Random r = new Random();
	                int arr[] = new int[1000];						//1000 numbers
	 
	                for(int i = 0; i < 1000; i++){
	                   arr[i] = r.nextInt(1000) + 1;     			// Random numbers between 1-1000
	                }
	 
	                for(int i = 0; i < 1000; i++){
	                   System.out.print(arr[i] + " ");
	 
	                sum += arr[i];             						 // Calculating the average
	                average = sum / 1000;
	 
	        }
	 
	        System.out.println("\n\n\nAverage is " + average + ".\n");
	 
	 
	        	int count1 = 0;                     	 			// Count numbers above average
	            for (int i = 0; i < 1000; i++){
	                if (arr[i] > average) {
	                count1++;
	                }
	            }            
	            int count2 = 0;                      				// Count numbers below average
	            for (int i = 0; i < 1000; i++){
	                if (arr[i] < average) {
	                count2++;
	                }
	            }
	 
	        System.out.println(count1 + " instances were above average. ");	//print
	        System.out.println(count2 + " instances were below average. ");
	            }
	        }