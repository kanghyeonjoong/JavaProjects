package sec07.exam02_string_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";

		/*
		 * 문자열 대치(replace())
		 * replace()메소드는 첫 번째 매개값인 문자열을 찾아 두 번째 매개값인 문자열로 대치한 새로운 문자열을 생성하고 리턴한다.
		 * String객체의 문자열은 변경이 불가한 특성을 갖기 때문에 replace()메소드가 리턴하는 문자열은 원래 문자열의 수정본이 아니라
		 * 완전히 새로운 문자열이다.
		 */
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
