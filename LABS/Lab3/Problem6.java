import java.util.Scanner;

public class Problem6 {
	 public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);											
	        System.out.print("Enter a string: ");											//asking user for a string
	        String words = input.nextLine();
	        System.out.print("There are " + Vowels(words)+" vowel(s) in the word "+words);	//displays the amount of vowels
	    }
	 public static int Vowels(String words){												//method that counts the vowels
	        int count = 0;
	        	
	        for (int i = 0; i < words.length(); i++){										//loop that goes through the length of the string
	        	
	            if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i'	//checks each position for a vowel
	                    || words.charAt(i) == 'o' || words.charAt(i) == 'u'){
	                count++;																//the count increases
	            }																
	        }
	        return count;																	//returns amount of vowels counted
	 }
}