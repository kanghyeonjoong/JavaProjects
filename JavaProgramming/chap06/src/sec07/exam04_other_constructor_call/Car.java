package sec07.exam04_other_constructor_call;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car() {
	}

	Car(String model) {
		//this()는 자신의 다른 생성자를 호출하는 코드로 반드시 생성자의 첫 줄에서만 허용된다.
		this(model, "은색", 250);
	}

	Car(String model, String color) {
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
