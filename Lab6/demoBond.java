
public class demoBond {
	public static void main(String[] args) {
		Bond bond1= new Bond(500,100,.05,10000);								//setting numbers to get the price
		System.out.println("The Price of the bond is: " + bond1.getPrice());	//display price
	}
}
