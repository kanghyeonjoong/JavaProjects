package sec05.exam08_and_or_negate_equals;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		//2의 배수
		IntPredicate predicateA = m -> m % 2 == 0;

		//3의 배수
		IntPredicate predicateB = m -> m % 3 == 0;

		IntPredicate predicateAB;
		boolean result;

		//and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);

		//or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까?" + result);

		//negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? " + result);
	}

}
