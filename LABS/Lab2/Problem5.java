import java.util.Scanner;

public class Problem5 {
public static void main(String[]args) {
		
		System.out.print("Enter a word: ");				//Asking the user for a word
		Scanner input1=new Scanner(System.in);
		String word1=input1.nextLine();
		
		System.out.print("Enter another word: ");		//Asking the user for a second word
		Scanner input2=new Scanner(System.in);
		String word2=input2.nextLine();
		
		
		
		if(word1.compareTo(word2)>0) 					//compares both words then sorts them in order
			System.out.println(word1+" comes after "+word2);
		
		else if(word1.compareTo(word2)<0) 
			System.out.println(word1+" comes before "+word2);
		
		else 
			System.out.println("Both are equal");
		
			
			
		
		
	}
}
