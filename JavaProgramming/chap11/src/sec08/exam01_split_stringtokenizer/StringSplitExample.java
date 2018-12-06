package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "홀길동&이수홍,백연수,감자바-최영호";

		/*
		 * 문자열이 특정 구분자(delimiter)로 연결되어 있을 경우, 구분자를 기준으로 부분 문자열을 분리하기 위해서는
		 * String의 split()메소드를 이용하거나, java.lang패키지의 StringTokenizer클래스를 이용할 수 있다.
		 * split()은 정규 표현식으로 구분하고, StringTokenizer는 문자로 구분한다.
		 * split()은 정규 표현식을 구분자로 해서 문자열을 분리한 후, 배열에 저장하고 리턴한다.
		 */
		String[] names = text.split("&|,|-");

		for (String name : names) {
			System.out.println(name);
		}

	}

}
