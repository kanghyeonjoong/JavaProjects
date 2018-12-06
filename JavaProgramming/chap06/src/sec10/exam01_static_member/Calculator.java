package sec10.exam01_static_member;

//정적(static)은 '고정된'이란 의미를 가지고 있다. 정적 멤버는 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드를 말한다.
//정적 멤버는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 소속된 멤버이기 때문에 클래스 멤버라고도 한다.
public class Calculator {
	// 필드
	static double pi = 3.14159;

	// 생성자

	// 메소드
	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
