
public class Manager2 implements Printable {
	String name;
	 double id;
	
	 public Manager2(String name, int id) {
			super();
			this.name=name;
			this.id=id;
		
		}
	 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getId() {
		return id;
	}


	public void setId(double id) {
		this.id = id;
	}

	@Override
	public void print() {
		
		
	}


	
}
