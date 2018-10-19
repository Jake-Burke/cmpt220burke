
public class Square {	 
	    private double width = 1;				//double data field
	    
	 
	    public Square() {						//no arg constructor
	        
	    }
	    
	    public Square(double newWidth) {		//creates square
	        width = newWidth;
	        
	    }
	    
	    public double getArea() {				//calculates area
	        return width * width;
	    }
	    
	    public double getPerimeter() {			//calculates perimeter
	        return 2 * (width + width);
	    }
}
