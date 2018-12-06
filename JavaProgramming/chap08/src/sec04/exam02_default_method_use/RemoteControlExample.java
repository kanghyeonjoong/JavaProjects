package sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		//구현 객체가 인터페이스 타입에 대입되면  인터페이스에 선언된 추상 메소드를 개발 코드에서 호출할 수 있게 된다.
		RemoteControl rc = null;// 인터페이스 변수 선언

		rc = new Television();//Television 객체를 인터페이스 타입에 대입
		rc.trurnOn();
		rc.turnOff();
		rc.setMute(true);

		rc = new Audio();//Audio객체를 인터페이스 타입에 대입
		rc.trurnOn();
		rc.turnOff();
		rc.setMute(true);
	}
}
