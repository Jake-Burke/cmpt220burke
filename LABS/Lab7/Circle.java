
public class Circle {
	
	private double x; 													//data fields
	private double y; 
	private double radius;


	Circle() {															//no arg constructor
		this(0, 0, 1);
	}

	Circle(double x, double y, double radius) {							//constructor that creates default circle
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getX() {												//method to get x
		return x;
	}

	public double getY() {												//method to get y
		return y;
	}
	
	public double getRadius() {											//method to get the radius
		return radius;
	}
	
	public double getArea() {											//method that gets the area of the circle
		return Math.PI * Math.pow(radius, 2);
	}

	public double getPerimeter() {										//method that gets the perimeter of the circle
		return 2 * Math.PI * radius;
	}

	public boolean contains(double x, double y) {					//returns true if the point is in the circle
		return Math.sqrt(Math.pow(x - this.x, 2) + 
				 Math.pow(y - this.y, 2)) 
				 < radius;
	}

	public boolean contains(Circle circle) {						//returns true if the circle is in the circle
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2))<= Math.abs(radius - circle.getRadius());
				  
	}

	public boolean overlaps(Circle circle) {					//returns true if the circle is overlapping with the other circle
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2))<= radius + circle.getRadius(); 
			
	}
}

