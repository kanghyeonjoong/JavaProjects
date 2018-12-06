package sec03.exam02_field_method_access;

public class A {
	int field1;

	void method1() {

	}

	static int field2;

	static void method2() {

	}

	//멤버 클래스안에서 바깥 클래스의 필드와 메소드를 접근할 때에도 제한이 따른다.
	//인스턴스 메버 클래스(B)안에서는 바깥 클래스의 모든 필드와 모든 메소드에 접근할 수 있지만,
	//정적 멤버 클래스(C)안에서는 바깥 클래스의 정적 필드와 메소드만 접근할 수 있다.
	
	//인스턴스 멤버 클래스
	class B {
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}

	//정적 멤버 클래스
	static class C {
		void method() {
//			field1 = 10;
//			method1();

			field2 = 10;
			method2();
		}
	}
}
