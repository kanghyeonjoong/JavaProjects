package sec07.exam02_string_method;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = new String("신민철");
		String strVal2 = "신민철";

		if (strVal1 == strVal2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}

		/*
		 * 문자열 비교(equals())
		 * 문자열 리터럴이 동일하다면 동일한 String객체를 참조한다.
		 * 원래 equals()는 Object의 번지 비교 메소드지만, String 클래스가 오버라이딩해서 문자열을 비교하도록 변경했다.
		 */
		if (strVal1.equals(strVal2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
