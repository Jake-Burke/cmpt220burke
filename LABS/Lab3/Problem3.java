
public class Problem3 {
	public static void main(String[]args) {
		int i;
		int count=0;
		
		for(i=1;i<=100;i++) {						//ASCII numbers between 1 and 100
			System.out.print((char)i+"="+i+" ");	//print the char corresponding to the number
			count++;
			
			if(count==20) {						//rows of 20	
				System.out.println();
				count=0;
			}
		}
	}

}
