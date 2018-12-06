package sec04.exam02_super;

public class SupersonicAirPlane extends AirPlane {
	// 상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			//AirPlane객체의 fly()메소드를 호출
			//자식 클래스 내부에서 오버라이딩된 부모 클래스의 메소드를 호출해야 하는 상황이 발생하면 super키워드를 붙여서
			//부모 메소드를 호출할 수 있다.
			super.fly();
		}
	}
}
