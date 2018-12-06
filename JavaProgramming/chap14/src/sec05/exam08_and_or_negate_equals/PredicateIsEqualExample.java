package sec05.exam08_and_or_negate_equals;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

	public static void main(String[] args) {
		/*
		 * Predicate<T>함수적 인터페이스는 and(), or(), negate() 디폴트 메소드 외에 isEqual()정적 메소드를 제공한다.
		 * isEqual()메소드는 test()매개값인 sourceObject와 isEqual()의 매개값인 targetObject를 java.util.Objects클래스의
		 * Equals() 매개값으로 제공하고, java.util.Objects.equals(sourceObject, targetObject)의 리턴값을 얻어 새로운 Predicate<T>를 생성한다.
		 */
		//두 문자열을 비교하기 위해서 Predicate의 isEqual() 정적 메소드를 사용한다.
		Predicate<String> predicate;

		predicate = Predicate.isEqual(null);
		System.out.println("null, null: " + predicate.test(null));

		predicate = Predicate.isEqual("Java8");
		System.out.println("null, Java8: " + predicate.test(null));

		predicate = Predicate.isEqual(null);
		System.out.println("Java8, null: " + predicate.test("Java8"));

		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, Java8: " + predicate.test("Java8"));

		predicate = Predicate.isEqual("Java8");
		System.out.println("Java7, Java8: " + predicate.test("Java7"));
	}

}
