package sec02.exam01_nestedclass_instance_member_class;

public class A {
	// 필드
	// 인스턴스 멤버 클래스는 인스턴스 필드와 메소드만 선언이 가능하고 정적 필드와 정적 메소드는 선언할 수 없다.
	class B {
		// 필드
		int field1;
//		static int field2;

		// 생성자
		B() {
		}

		// 메소드
		void method1() {
			System.out.println(field1);
			System.out.println("A클래스안의 B클래스-method1()");
		}

//		static void method2() {
//		}
	}
}
