package sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {

	// 디폴트 메소드가 있는 인터페이스 상속시 디폴트 메소드를 활용하는 방법
	// 1. 디폴트 메소드를 단순히 상속받는다.
	// 2. 디폴트 메소드를 재정의(Override)해서 실행 내용을 변경한다.
	// 3. 디폴트 메소드를 추상 메소드로 재선언한다.
	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("ChildInterface1 구현 객체-method1() 실행");
			}

			@Override
			public void method3() {
				System.out.println("ChildInterface1 구현 객체-method3() 실행");
			}
		};

		ci1.method1();
		ci1.method2();
		ci1.method3();

		System.out.println();

		ChildInterface2 ci2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ChildInterface2 구현 객체-method1() 실행");

			}

			@Override
			public void method3() {
				System.out.println("ChildInterface2 구현 객체-method3() 실행");

			}
		};

		ci2.method1();
		ci2.method2();
		ci2.method3();

		System.out.println();

		ChildInterface3 ci3 = new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ChildInterface3 구현 객체-method1() 실행");

			}

			@Override
			public void method3() {
				System.out.println("ChildInterface3 구현 객체-method3() 실행");

			}

			@Override
			public void method2() {
				System.out.println("ChildInterface3 구현 객체-method2() 실행");

			}
		};

		ci3.method1();
		ci3.method2();
		ci3.method3();
	}
}
