
public class Problem7 {
	
	public static void main(String[] args) {
   		int count = 1;
   		
		for(int i = 1; i <= 50; i++){						//taking the first 50 numbers
			System.out.print(PentagonalNumbers(i)+" ");		//calling the method and printing the numbers
			if(count % 10 == 0) System.out.println();		//rows of 10
			count++;
		}
    }
  public static int PentagonalNumbers(int n) {				//method that gets the pentagonal numbers
		return (n * (3 * n - 1))/2;							//formula
	}
}
