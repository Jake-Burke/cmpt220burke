
public class Rectangle implements Printable {
	  int length;
	  int width;
	  
	  public Rectangle(int length, int width) {
			super();
			this.length=length;
			this.width=width;
		
		}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void print() {
	
		
	}
	  
}
