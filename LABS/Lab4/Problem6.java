import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {    				
		int[] array= {1,2,3,4,5,6,7,8,9,10,-1};					//creating the array
		
		for(int i=0;i<array.length;i++)							//printing the array
		System.out.println(array[i]);
		
		addInt(3);												//applying methods
		insertInt(10,3);
		insertInt(100,7);
		
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		
	}
	public static void addInt(int...number) {					//ad a integer
		addInt(3);
	}
	public static void insertInt(int...number) {				//insert an integer
		insertInt(10,3);
		insertInt(100,7);
	}

}