package springtest;

import org.springframework.stereotype.Component;

@Component
public class Audio {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Music Playing";
	}
}
