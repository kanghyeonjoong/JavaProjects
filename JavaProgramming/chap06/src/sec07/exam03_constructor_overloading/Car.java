package sec07.exam03_constructor_overloading;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자가 오버로딩(Overloading)되어 있을 경우, new연산자로 생성자를 호출할 때 제공되는 매개값의 타입, 개수, 순서에 의해 호출될 생성자가 결정된다.
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
