package sec06.exam02_argument_method_references;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;//객체 T와 U를 int로 매핑(타입 변환)

		/*
		 * 매개변수의 메소드 참조
		 * 메소드는 람다식 외부의 클래스 멤버일 수도 있고, 람다식에서 제공하는 매개 변수의 멤버일 수도 있다.
		 * (a, b)->{ a.instanceMethod(b); }
		 * 람다식에서 제공하는 a 매개 변수의 메소드를 호출해서 b 매개 변수를 매개값으로 사용하는 경우도 있다.
		 * 이것을 메소드 참조로 표현하면 a의 클래스 이름 뒤에 ::를 붙이고 메소드 이름을 기술한다. 작성 방법은 정적 메소드 참조와 동일하지만,
		 * a의 인스턴스 메소드가 참조되므로 전혀 다른 코드가 실행된다.
		 * =>클래스::인스턴스 메소드
		 */

		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "JAVA8"));

		function = String::compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));

	}

	public static void print(int order) {
		if (order < 0) {
			System.out.println("사전순으로 먼저 옵니다.");
		} else if (order == 0) {
			System.out.println("동일한 문자입니다.");
		} else {
			System.out.println("사전순으로 나중에 옵니다.");
		}
	}
}
