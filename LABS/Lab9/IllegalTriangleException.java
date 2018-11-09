
public class IllegalTriangleException extends Exception {
	private double side1;					//data fields
	private double side2;
	private double side3;

	public IllegalTriangleException(double side1, double side2, double side3) {				//Illegal triangle exception
		super("Please try again. This Triangle has Illegal sides " + side1 + " " + side2 + " " + side3);
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {				//gets side1
		return side1;
	}

	public double getSide2() {				//gets side2
		return side2;
	}

	
	public double getSide3() {				//gets side3
		return side3;
	}
}
