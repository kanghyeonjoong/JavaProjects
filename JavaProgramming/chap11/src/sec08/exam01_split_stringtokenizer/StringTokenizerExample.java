package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";

		/*
		 * StringTokenizer클래스
		 * 문자열이 한 종류의 구분자로 연결되어 있을 경우 사용한다.
		 * StringTokenizer 객체를 생성할 때 첫 번째 매개값으로 전체 문자열을 주고, 두 번째 매개값으로 구분자를 주면 된다.
		 * 구분자를 생략하면 공백(space)가 기본 구분자가 된다.
		 */
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();

		/*
		 * nextToken()메소드로 토큰을 하나 꺼내오면 StringTokenizer객체에는 해당 토큰이 없어진다.
		 * StringTokenizer객체에서 더 이상 가져올 토큰이 없다면 nextToken()메소드는
		 * java.util.NoSuchElementException 예외를 발생시킨다.
		 * 그래서 nextToken()메소드를 사용하기 전에 hasMoreTokens()메소드로 꺼내올 토큰이 있는지 조사한 후
		 * nextToken()메소드를 호출한다.
		 */
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
