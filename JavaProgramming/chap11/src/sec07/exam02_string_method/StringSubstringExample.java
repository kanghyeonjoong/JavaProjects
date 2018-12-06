package sec07.exam02_string_method;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";

		/*
		 * 문자열 잘라내기(substring())
		 * substring(int beginIndex, int endIndex)는 주어진 시작과 끝(제외) 인덱스 사이의 문자열을 추출하고,
		 * substring(int beginIndex)는 주어진 인덱스부터 끝까지 문자열을 추출한다.
		 */
		String firstNum = ssn.substring(0, 6);//인덱스 0(포함)~6(제외) 사이의 문자열을 추출함
		System.out.println(firstNum);
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
