package sec07.exam03_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			//Car객체의 Tire 필드(frontLeftTire, frontRightTire, backLeftTire, backRightTire) 에 HankookTire와 KumhoTire 객체를 대입하고 있다.
			//즉 자동 타입 변환이 되고 있다. 교체된 이후부터는 Car객체의 run()메소드가 호출될 때 HankookTire와 KumhoTire에서 재정의된 
			//roll()메소드가 실행된다.
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
			}
			System.out.println("------------------------------------");
		}
	}

}
