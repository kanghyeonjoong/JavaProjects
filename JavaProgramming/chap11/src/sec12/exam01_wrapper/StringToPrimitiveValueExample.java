package sec12.exam01_wrapper;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		/*
		 * 문자열을 기본 타입 값으로 변환
		 * 포장 클래스에 "parse+기본타입"명으로 되어있는 정적 메소드를 이용한다.
		 */
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);

	}

}
