package sec05.exam07_andthen_compose;

import java.util.function.Consumer;

public class ConsumerandThenExample {

	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};

		Consumer<Member> consumerB = (m) -> {
			System.out.println("ConsumerB: " + m.getId());
		};

		/*
		 * Consumer의 순차적 연결
		 * Consumer종류의 함수적 인터페이스는 처리 결과를 리턴하지 않기 때문에 andThen()디폴트 메소드는 함수적 인터페이스의 호출 순서만 정한다.
		 */
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
	}

}
