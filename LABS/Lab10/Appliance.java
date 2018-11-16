
public class Appliance implements Comparable {
	private double voltage;
	private String Color;
	private String madeIn;
	private double price;
	
	 public Appliance(double voltage, String Color, String madeIn, double price) {
			super();
			this.voltage=voltage;
			this.Color=Color;
			this.madeIn=madeIn;
			this.price=price;
		
		}
	public Appliance() {
		
	}
	public double getVoltage() {
		return voltage;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void print() {
		
		
	}
	public String toString() {
		 return "Price = " + price;
		 }
	 
	 @Override
	 public int compareTo(Object o) {
	    return  (this.getPrice() < ((Appliance) o).getPrice() ? -1 : (this.getPrice() == ((Appliance) o).getPrice() ? 0 : 1));
	}
}
