package sec07.exam02_string_method;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2));

		/*
		 * 알파벳 소,대문자 변경(toLowerCase(), toUpperCase())
		 * toLowerCase(), toUpperCase()메소드는 소문자, 대문자로 바꾼 새로운 문자열을 생성한 후 리턴한다.
		 */
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));

		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
