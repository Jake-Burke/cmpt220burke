
public class Clerk extends Employee {
	String name;
	 double age;
	 double hourRate;
	public Clerk(String name, int age, int hourRate) {
		super(name, hourRate, hourRate);
		this.name=name;
		this.age=age;
		this.hourRate=hourRate;
		
	}

	@Override
	public double salary(double hours) {
		
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

}
