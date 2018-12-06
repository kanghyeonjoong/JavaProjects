package sec05.exam06_instanceof;

public class Driver {
	// 매개 변수의 타입이 인터페이스일 경우, 어떠한 구현 객체도 매개값으로 사용할 수 있고,
	// 어떤 구현 객체가 제공되느냐에 따라 메소드의 실행 결과는 다양해 질 수 있다.(매개 변수의 다양성)
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();// Bus 타입으로 강제 타입 변환을 하는 이유
		}

		vehicle.run();
	}
}
