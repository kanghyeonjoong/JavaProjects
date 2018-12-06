package sec05.exam03_field_array;

public class Car {
	// 필드
	//인터페이스 배열로 구현 객체 관리
	Tire[] tires = { new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire() };

	void run() {
		for (Tire tire : tires) {
			tire.roll();
		}
	}
}
