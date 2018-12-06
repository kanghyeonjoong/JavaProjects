package sec07.exam01_string_constructor;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		/*
		 * 자바의 문자열은 java.lang.String 클래스의 인스턴스로 관리된다. 문자열 리터럴은 String객체로 자동 생성되지만,
		 * String 클래스의 다양한 생성자를 이용해서 직접 String 객체를 생성할 수 있다.
		 */
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}

}
