import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem4 {
	 public static void main(String[] args) {

		if (args.length != 2) {									
	          System.out.println(" java Problem_3 hello test.txt ");		//printing the file
	          System.exit(1);
	      }

	      File filename = new File(args[1]);								//checking to see if file exists
	        
	      if (!filename.exists()) {										//if not
	          System.out.println(args[1] + " does not exist.");			//print if it does not exist
	          System.out.println(2);
	      }

	      String string = "";
	        
	      try {
	          Scanner input = new Scanner(filename);						//creating input for the file
	          while (input.hasNext()) {
	              string += input.nextLine();
	          }
	            
	      } catch (FileNotFoundException e) {								//catch with a FileNotFound Exception
	           e.printStackTrace();
	      }
	        
	      string = string.replaceAll(args[0], "");						//removes the string the string
	      try {
	          PrintWriter output = new PrintWriter(filename);
	          System.out.println(string);
	          output.write(string);
	          output.close();
	            
	      } catch (FileNotFoundException e) {
	            e.printStackTrace();
	      }

	  }
}
