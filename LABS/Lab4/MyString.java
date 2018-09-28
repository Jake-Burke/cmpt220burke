import java.util.Scanner;

public class MyString {
	  public static void main(String[]args){
		    {
		        Scanner input = new Scanner(System.in);					//asking user for a string
		        System.out.println("Enter a string: ");
		        String s = input.nextLine();
		        if(isPalindrome(s))										//if its a palindrome print that it is
		            System.out.println(s + " is a palindrome");
		        else
		            System.out.println(s + " is not a palindrome");		//if not palindrome print that its not
		    }
	  }
	  
	  		public static String reverse(String s) {					//reversing the string
	  		String reverse="";
	  		for(int i=s.length()-1;i>=0;i--) {
	  			reverse= reverse +s.charAt(i);			
	  		}
	  		return reverse;
	  		}
		  public static boolean isPalindrome(String s)					//testing to see if its true or false
		    {
		        if(s.length() == 0 || s.length() == 1)           
		            return true; 
		        
		        if(s.charAt(0) == s.charAt(s.length()-1))
		            return true;
		        
		            return false;
		    }
	  }