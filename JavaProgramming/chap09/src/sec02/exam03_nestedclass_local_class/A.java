package sec02.exam03_nestedclass_local_class;

public class A {
	//로컬 클래스는 메소드 내부에서만 사용되므로 접근 제한자(public, private) 및 static을 붙일 수 없다.
	//로컬 클래스 내부에서는 인스턴스 필드와 메소드만 선언이 가능하고 정적 필드와 메소드는 선언할 수 없다.
	void method() {
		// 로컬 클래스
		class D {
			D() {
			}

			int field1;
			//static int field2;

			void method1() {
			}

//			static void method2() {
//			}
		}
		
		D d=new D();
		d.field1=3;
		d.method1();
	}
}
