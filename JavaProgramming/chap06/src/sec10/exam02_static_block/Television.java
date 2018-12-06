package sec10.exam02_static_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;

	// 정적 필드의 복잡한 초기화 작업을 위해서 정벅 블록(static block)을 제공한다.
	// 정적 블록은 클래스가 메모리로 로딩될 때 자동적으로 실행된다. 정적 블록은 클래스 내부에 여러 개가 선언되어도 상관없다.
	// 클래스가 메모리로 로딩될 때 선언된 순서대로 실행된다.
	static {
		info = company + "-" + model;
	}
}
