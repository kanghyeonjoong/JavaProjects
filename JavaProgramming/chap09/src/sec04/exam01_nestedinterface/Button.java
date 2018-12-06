package sec04.exam01_nestedinterface;

//중첩 인터페이스는 클래스의 멤버로 선언된 인터페이스를 말한다.
//인터페이스를 클래스 내부에 선언하는 이유는 해당 클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기 위해서이다.
//특히 UI프로그래밍에서 이벤트를 처리할 목적으로 많이 사용된다.
public class Button {
	// 필드
	OnClickListener listener;// 인터페이스 타입 필드

	// 인터페이스의 구현 객체를 받아 필드에 대입한다.
	void setOnClickListener(OnClickListener listener) {// 매개변수의 다형성
		this.listener = listener;
	}

	// 버튼 이벤트(touch()메소드가 실행되었을 때)인터페이스를 통해 구현 객체의 메소드(listener.onClick())를 호출한다.
	void touch() {
		listener.onClick();
	}

	// 중첩 인터페이스
	interface OnClickListener {
		// 추상 메소드
		void onClick();
	}
}
