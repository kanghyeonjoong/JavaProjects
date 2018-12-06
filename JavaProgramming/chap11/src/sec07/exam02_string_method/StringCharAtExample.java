package sec07.exam02_string_method;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1234567";
		/* charAt(int index) 메소드에서 인덱스는 0에서부터 "문자열길이-1"까지의 번호를 말한다. */
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}

	}

}
