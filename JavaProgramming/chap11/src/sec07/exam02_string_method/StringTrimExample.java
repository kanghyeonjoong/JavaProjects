package sec07.exam02_string_method;

public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = "  02";
		String tel2 = "123     ";
		String tel3 = "            1234          ";

		/*
		 * 문자열 앞뒤 공백 잘라내기(trim())
		 * trim()메소드는 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성하고 리턴한다.
		 */
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
