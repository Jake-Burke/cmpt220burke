import java.util.ArrayList;
import java.util.Scanner;

public class sortArrayList {
	  public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);							//scanner
	        System.out.print("Enter 5 numbers: ");
	        
	        ArrayList<Integer> list = new ArrayList<>();					//array list
	        for (int i = 0; i < 5; i++) list.add(input.nextInt());      	//loop to ask for input  
	        sort(list);
	        
	        System.out.println("Sorted Numbers");							//displaying sorted numbers
	        System.out.println(list);

	    }

	    public static void sort(ArrayList<Integer> list) {

	        for (int i = 0; i < list.size() - 1; i++) {					//sorting the array
	            int currentMin = list.get(i);
	            int currentIndex = i;

	            for (int j = i + 1; j < list.size(); j++) {
	                if (currentMin > list.get(j)) {
	                    currentMin = list.get(j);
	                    currentIndex = j;
	                }
	            }

	            if (currentIndex != i) {
	                list.set(currentIndex, list.get(i));
	                list.set(i, currentMin);
	            }
	        }

	    }
	}
	
