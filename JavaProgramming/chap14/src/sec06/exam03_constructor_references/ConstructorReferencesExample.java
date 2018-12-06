package sec06.exam03_constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		/*
		 * 생성자 참조 : 클래스 이름 뒤에 :: 기호를 붙이고 new 연산자를 기술한다.
		 * (a, b)->{ return new 클래스(a, b); }
		 * =>클래스::new
		 * 메소드 참조는 생성자 참조도 포함한다.
		 */
		Function<String, Member> function1;
		function1 = (x) -> new Member(x);
		Member member1 = function1.apply("blue");

		function1 = Member::new;//생성자참조
		member1 = function1.apply("blue");

		BiFunction<String, String, Member> function2;
		function2 = (x, y) -> new Member(x, y);
		Member member2 = function2.apply("강가딘", "blue");

		function2 = Member::new;//생성자 참조
		member2 = function2.apply("강가딘", "blue");

	}

}
