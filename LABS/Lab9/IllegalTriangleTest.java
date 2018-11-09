import java.util.Scanner;

public class IllegalTriangleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean testSides = true;
		do {					//does this
			System.out.print("Enter three side of the triangle: ");  //asking for 3 sides
			double side1 = input.nextDouble();		
			double side2 = input.nextDouble();		
			double side3 = input.nextDouble();
	
			try {
				Triangle triangle = new Triangle(side1, side2, side3);	//try's to create the triangle
				testSides = false;	
				System.out.println(triangle.toString());
			}
			catch (IllegalTriangleException ex) {				//using the exception
				System.out.println(ex.getMessage());			//printing the message
			}

		} while (testSides);			//while test sides is true		
	}
}
