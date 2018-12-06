package sec15.exam01_format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		/*
		 * 문자열 형식 클래스(MessageFormat)
		 * java.text.MessageFormat 클래스를 사용하면 문자열에 데이터가 들어갈 자리를 표시해 두고, 프로그램이 실행하면서
		 * 동적으로 데이터를 삽입해 문자열을 완성시킬 수 있다.
		 */
		String id = "java";
		String name = "신용권";
		String tel = "010-123-1234";

		String text = "회원 ID: {0} \n회원 이름: {1}\n회원 전화: {2}";
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);
		System.out.println();

		/* MessageFormat.format(pattern, arguments)의 arguments에는 인덱스 순서에 맞게 값을 나열하거나 배열을 대입한다. */
		String sql = "insert into member values( {0}, {1}, {2} )";
		String result2 = MessageFormat.format(sql, new Object[] { "java", "신용권", "010-123-1234" });
		System.out.println(result2);
	}

}
