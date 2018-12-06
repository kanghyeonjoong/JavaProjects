package sec05.exam01_bounded_type_parameter;

public class Util {
	/*
	 * 제한된 파라미터(bounded type parameter)를 선언하려면 타입 파라미터 뒤에 extends 키워드를 붙이고
	 * 상위 타입 파라미터 타입을 명시하면 된다. 상위 타입은 클래스뿐만 아니라 인터페이스도 가능하다.
	 * 타입 파라미터에 지정되는 구체적인 타입은 상위 타입이거나 상위  타입의 하위 또는 구현 클래스만 가능하다.
	 * 주의할 점은 메소드의 중괄호{}안에서 타입 파라미터 변수로 사용 가능한 것은 상위 타입의 멤버(필드, 메소드)로 제한된다.
	 * 하위 타입에만 있는 필드와 메소드는 사용할 수 없다.
	 */
	//제네릭 메소드
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();

		return Double.compare(v1, v2);//첫 번째 매개값이 작으면 -1을 같으면 0, 크면 1을 리턴한다.
	}
}
