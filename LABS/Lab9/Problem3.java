import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number in binary format: ");	//asks user for input
		try {
			System.out.println(bin2Dec(input.nextLine()));		//try's bin2Sec method
		}
		catch (NumberFormatException ex) {						//will print error message
			System.out.println(ex.getMessage());
		}
	}
	
	public static int bin2Dec(String binaryString) throws NumberFormatException {			
		int number = 0;	//data field to set number to 0
		
		for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--){	//loop
			
			if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')			//must be a 0 or 1
				
				throw new NumberFormatException("The string is not a binary string");	//will throw error if number is not binary
			number += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);
		}
		return number;											//returns number
	} 
}
