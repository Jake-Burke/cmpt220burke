
public class SportCar implements Printable {
	  String make;
	  int number;
	  
	  public SportCar(String make, int number) {
			super();
			this.make=make;
			this.number=number;
		
		}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	  
}
