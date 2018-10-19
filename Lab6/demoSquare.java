
public class demoSquare {
	 public static void main(String[] args) {
		 
		    Square square1 = new Square(40);													//sets square length
	        System.out.println("The area of a 40.0 square is " + square1.getArea());			//area
	        System.out.println("The perimeter of a 40.0 square is " + square1.getPerimeter());	//perimeter
	        
	        Square square2 = new Square(35.9);	        										//sets square length
	        System.out.println("The area of a 35.9 square is " + square2.getArea());			//area
	        System.out.println("The perimeter of a 35.9 square is " + square2.getPerimeter());	//perimeter
	    }
}
