package sec07.exam03_constructor_overloading;

public class Car {
	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	// �����ڰ� �����ε�(Overloading)�Ǿ� ���� ���, new�����ڷ� �����ڸ� ȣ���� �� �����Ǵ� �Ű����� Ÿ��, ����, ������ ���� ȣ��� �����ڰ� �����ȴ�.
	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
