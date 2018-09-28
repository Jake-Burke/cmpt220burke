import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) {    
	        int[] array = new int[100];														//array size
	        int count = 0;
	        Scanner input = new java.util.Scanner(System.in);
	        System.out.print("Enter up to 100 positive integers but enter 0 to stop: ");	//asking for input
	        for (int i = 0; i < 101; i++) {
	            
	            array[i] = input.nextInt();
	            count++; 
	            
	            if (array[i] == 0)															//if array=0 then break
	                break;
	            }
	        
	             Arrays.sort( array, 0, count);      									//sorts and displays array  
	             for (int i = 0; i < count; i++) {
	             System.out.print("   " + array[i]);


	        }
	}
}