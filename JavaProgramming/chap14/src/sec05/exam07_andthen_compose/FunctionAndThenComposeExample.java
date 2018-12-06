package sec05.exam07_andthen_compose;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;

		functionA = m -> m.getAddress();
		functionB = a -> a.getCity();
		
		/*
		 * andThen()과 compose() 디폴트 메소드
		 * Consumer, Function, Operator 종류의 함수적 인터페이스는 andThen()과 compose() 디폴트 메소드를 가지고 있다.
		 */
		
		//andThen()메소드를 호출한 함수적 인터페이스는 functionA이다.
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);

		//compose()메소드를 호출한 함수적 이터페이스는 functionB이다.
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);
	}

}
