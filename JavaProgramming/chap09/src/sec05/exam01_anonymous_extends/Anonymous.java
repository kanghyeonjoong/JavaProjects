package sec05.exam01_anonymous_extends;

public class Anonymous {
	// 핃드 선언과 초기값 대입
	// 부모 클래스(매개값,...) { }은 부모 클래스를 상속해서 중괄호 { }와 같이 자식 클래스를 선언하라는 뜻이고, new 연산자는
	// 이렇게 선언된 자식 클래스를 객체로 생성한다.
	// 부모클래스(매개값,...)은 부모 생성자를 호출하는 코드이다.
	Person field= new Person() {
		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	// 로컬 변수 선언과 초기값 대입
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};

		// 로컬 변수 사용
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
