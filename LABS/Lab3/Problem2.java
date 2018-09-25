
public class Problem2 {
	public static void main(String[]args) {
		int count=0;
		
		for (int i=100;i<=500;i++) {				//Numbers between 100 and 500
			if(i % 5==0 || i % 7==0) {				//divisible by 5 or 7
				System.out.print(i+" ");
				count++;
			}
			if(count==10) {						//rows of 10
				System.out.println();
				count=0;
			}
		}
	}

}
