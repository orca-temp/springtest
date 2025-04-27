package springtest;

public class Oil {
	public Oil(String brand) {
		super();
		this.brand = brand;
	}

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Oil [brand=" + brand + "]";
	}
	
}
