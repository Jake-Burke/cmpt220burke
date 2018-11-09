
public class GeometricObject {

	private String color = "white";												//data fields
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() {}													//no arg constructor
	
	public GeometricObject(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {													//gets color
		return color;
	}

	public void setColor(String color) {										//sets color
		this.color = color;
	}

	public boolean isFilled() {													//if it is filled
		return filled;	
	}

	public void setFilled(boolean filled) {										//set filled
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {									//get date
		return dateCreated;
	}
	
}

