
public abstract class Employee {
	String name;
	 double age;
	 double hourRate;
	 
	 public Employee(String name, int age, int hourRate) {
			super();
			this.name=name;
			this.age=age;
			this.hourRate=hourRate;
	 }
	 public abstract double salary(double hours);
	 
	 public String toString() {
	 return "Name = " + name + " Age =" + age + " HourRate ="+ hourRate;
	 }
	public void print() {
		
		
	}

}
