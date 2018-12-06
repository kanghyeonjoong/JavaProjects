package sec06.exam05_array_reference_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		/*
		 * 기본 타입 배열은 각 항목에 직접 값을 가지고 있지만, 참조 타입(클래스,인터페이스) 배열은 각 항목에 객체의 번지를 가지고 있다.
		 * String은 클래스 타입이므로 String[]배열은 각 항목에 문자열이 아니라, String객체의 주소를 가지고 있다.
		 */
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]);// true
		System.out.println(strArray[0] == strArray[2]);// false
		System.out.println(strArray[0].equals(strArray[2]));// true

	}

}
