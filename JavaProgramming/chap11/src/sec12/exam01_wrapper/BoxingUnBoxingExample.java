package sec12.exam01_wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		/*
		 * 자바는 기본 타입(byte, char, short, int, long, float, double, boolean)의 값을 갖는 객체를포장(Wrapper) 객체라 한다.
		 * 특징은 포장하고 있는 기본 타입의 값은 외부에서 변경할 수 없다. 만약 내부의 값을 변경하고 싶다면 새로운 포장 객체를 만들어야 한다.
		 * 기본 타입의 값을 포장 객체로 만드는 과정을 박싱(Boxing)이라고 한다. 반대로 포장 객체에서 기본 타입의 값을 얻어내는 과정을 언박싱(Unboxing)이라고 한다.
		 */

		/*
		 * Boxing을 하는 방법
		 * 1. 포장 클래스의 생성자를 이용하여 생성하는 방법(매개값으로 기본 타입의 값 또는 문자열을 넘겨준다)
		 * 2. 포장 클래스마다 가지고 있는 valueOf() 정적 메소드를 이용하는 방법
		 */
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		/*
		 * Unboxing하는 방법
		 * 포장 객체에서 다시 기본 타입의 값을 얻어내는 위해서는 각 포장 클래스마다 가지고 있는 "기본타입명+Value()"메소드를 호출한다.
		 */
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
