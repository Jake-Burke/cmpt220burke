
public class Problem1 {
	public static void main(String[]args) {
		System.out.println("in   cm | cm  in");								//header
		System.out.println("-----------------");
		
		int[]inches=new int [51];											// 2 arrays
		int[]centimeters=new int [256];
			
		for (int i=1;i<51;i++) {											//sets up inches array
			inches[i]=i;
			System.out.println(inches[i]+"  "+inches[i]*2.54+" | "+"  ");
		}
			for (int j=1;j<256;j+=5) {										//sets up cm array
				centimeters[j]=j;
				System.out.println(centimeters[j]+"  "+centimeters[j]*0.39);
			}
		
	}
	
}																			//unable to get data next to each other