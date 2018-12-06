package sec04.exam03_static_method_use;

//개발코드에서 인터페이스는 클래스의 필드, 생성자 또는 메소드의 매개변수, 생성자 또는 메소드의 로컬 변수로 선언될 수 있다.
public class MyClass {
	// 필드
	RemoteControl rc = new Television();

	// 생성자
	public MyClass(RemoteControl rc) {
		this.rc = rc;
	}

	// 메소드
	void methodA() {
		// 로컬 변수
		RemoteControl rc = new Audio();
		rc.setMute(true);
	}

	void methodB(RemoteControl rc) {
		rc.trurnOn();
		rc.turnOff();
	}

	void methodC() {
		this.rc.trurnOn();
		this.rc.turnOff();
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass(new Audio());
		myClass.methodC();
		
		myClass.methodB(new Television());
		myClass.methodA();
	}
}
