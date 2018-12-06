package sec02.exam01_non_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		/*
		 * Object타입을 사용하면 모든 종류의 자바 객체를 저장할 수 있다는 장점은 있지만, 저장할 때 자동 타입 변환이 발생하고,
		 * 읽어올 때도 강제 타입 변환(캐스팅)이 발생한다. 이러한 타입 변환이 빈번해지면 전체 프로그램의 성능에 좋지 못한 결과를
		 * 가져올 수 있다.
		 */
		Box box = new Box();
		box.set("홍길동");//String->Object(자동 타입 변환)
		String name = (String) box.get();//Object->String(강제 타입 변환-casting)
		System.out.println(name);

		box.set(new Apple());//Apple->Object(자동 타입 변환)
		Apple apple = (Apple) box.get();//Object->Apple(강제 타입 변환)

	}

}
