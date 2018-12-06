package sec06.exam01_class;

public class Car {
	private String model;
	private String company;

	public Car(String model) {
		this.model = model;
	}

	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
