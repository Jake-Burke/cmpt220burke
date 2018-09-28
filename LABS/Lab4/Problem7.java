import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("How many numbers do you want in your array?");		//asking for array size
		int n =input.nextInt();	
		int[]array=new int[n];
		System.out.println("Enter some numbers: ");								//asking for numbers
		
		for(int i=0;i<n;i++) {				
			array[i]=input.nextInt();
		}
		Arrays.sort(array);														//sorting the array
		System.out.println("You entered: "+Arrays.toString(array) );
		
		int array2=array[0];
		boolean found = false;
		
		for(int i=0; i<array.length;i++) {										//removing duplicate numbers
			if(array2 == array[i]&& !found) {
				found=true;
				System.out.println(array2+" ");
			}
				else if (array2 != array[i]) {
					array2=array[i];
					System.out.println(array2+" ");
					}
				}
				
			}

				
	}


