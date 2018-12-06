package sec03.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		/*
		 * 람다식은 익명 함수(anonymous function)을 생성하기 위한 식이다.
		 * 람다식의 형태는 매개 변수를 가진 코드 블록이지만, 런타임시에는 익명 구현 객체를 생성한다.
		 * =>람다식->매개 변수를 가진 코드블록->익명 구현 객체
		 * =>(타입 매개 변수,...)->{실행문;...}
		 * 
		 * MyFunctionalInterface를 타켓 타입으로 갖는 람다식으로 람다식에서 매개 변수가 없는 이유는 method()가 매개 변수를 가지지 않기 때문이다.
		 */
		MyFunctionalInteface fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};

		/*
		 * 람다식이 대입된 인터페이스의 참조 변수는 method()를 호출할 수 있다.
		 * method()호출은 람다식의 중괄호 { }를 실행시킨다.
		 */
		fi.method();

		fi = () -> {
			System.out.println("method call2");
		};
		fi.method();

		fi = () -> System.out.println("method call3");
		fi.method();
	}

}
