package sec07.exam02_string_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);

		/*
		 * 문자열 찾기(indexOf())
		 * indexOf()메소드는 매개값으로 주어진 문자열이 시작되는 인덱스 위치를 리턴한다.
		 * 만약 주어진 문자열이 포함되어 있지 않으면 -1을 리턴한다.
		 */
		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}

	}

}
