package sec02.exam02_nestedclass_static_member_class;

public class A {
	// 정적 멤버 클래스는 모든 종류의 필드와 메소드를 선언할 수 있다.
	static class C {
		// 생성자
		C() {
		}

		// 필드
		int field1;
		static int field2;

		// 메소드
		void method1() {
		}

		static void method2() {
		}
	}
}
