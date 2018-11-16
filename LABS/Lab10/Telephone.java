
public class Telephone extends Appliance {
	private String brand;
	private String model;
	private int warranty;
	
	public Telephone(String brand, String model, int warranty) {
		super();
		this.brand=brand;
		this.model=model;
		this.warranty=warranty;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public String toString() {
		 return "Brand = " + brand + " model =" + model + " warranty ="+ warranty;
		 }
}

