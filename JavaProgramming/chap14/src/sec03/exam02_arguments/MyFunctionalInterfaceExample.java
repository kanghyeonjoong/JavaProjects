package sec03.exam02_arguments;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		//MyFunctionalInterface를 타켓 타입으로 갖는 람다식을 선언
		MyFunctionalInterface fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);

		fi = (x) -> {
			System.out.println(x * 5);
		};
		fi.method(2);

		//매개 변수가 하나일 경우에는 괄호()를 생략할 수 있다.
		fi = x -> System.out.println(x * 5);
		fi.method(2);
	}

}
