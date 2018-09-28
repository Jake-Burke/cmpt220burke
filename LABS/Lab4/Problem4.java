
public class Problem4 {
	 public static void main(String[] args) {
	        
	        String word = "Jake Burke";       				//Entering a String    
	        int count[] = new int[256];      				//creating an array of 256   
	  
	        for (int i = 0; i < word.length(); i++) 		//counting the letters at each position
	            count[word.charAt(i)]++; 
	  
	        char letter[] = new char[word.length()]; 		//Creating an array of the string size
	        
	        for (int i = 0; i < word.length(); i++) { 		
	            letter[i] = word.charAt(i); 
	            int search = 0; 
	            for (int j = 0; j <= i; j++) { 
	                if (word.charAt(i) == letter[j])  		//if any matches are found
	                    search++;                 
	            }   
	            if (search == 1)  							//Print out the letters and occurrences
	                System.out.println("The letter "+word.charAt(i) + " occurs " + count[word.charAt(i)]+" time(s)");             
	        } 
	        
	    } 
}
