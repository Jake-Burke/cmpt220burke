
public class Problem6 {
	public static void main(String[]args) {
		
		int high=9;												//max number
		int low=0;												//min number
			
		int first=2;											//Wont allow 0 or 1 in first spot
		
		
		
		int a =(int)(Math.random()*(high-first+1))+ first;		//taking a random number and multiplying it by the high-low+1 and then adding low
		int b =(int)(Math.random()*(high-low+1))+ low;			
		int c =(int)(Math.random()*(high-low+1))+ low;
		int d =(int)(Math.random()*(high-low+1))+ low;
		int e =(int)(Math.random()*(high-low+1))+ low;
		int f =(int)(Math.random()*(high-low+1))+ low;
		int g =(int)(Math.random()*(high-low+1))+ low;
		int h =(int)(Math.random()*(high-low+1))+ low;
		int i =(int)(Math.random()*(high-low+1))+ low;
		int j =(int)(Math.random()*(high-low+1))+ low;
		
		System.out.println("Random Phone Number Generated: ("+a+b+c+")"+d+e+f+"-"+g+h+i+j);	//This displays the Phone Number
	}
}
