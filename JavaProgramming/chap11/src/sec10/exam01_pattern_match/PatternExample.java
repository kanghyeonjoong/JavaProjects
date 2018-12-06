package sec10.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		/*
		 * Pattern클래스
		 * java.util.regex.Pattern 클래스의 정적메소드 matches()는
		 * 문자열을 정규 표현식으로 검증하는 기능이다.
		 */
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";//정규표현식
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angle1234@naver.com";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

	}

}
