package sec09.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		/*
		 * 문자열을 저장하는 String은 내부의 분자열을 수정할 수 없다.
		 * 수정하면 새로운 문자열을 생성한 후 리턴한다.
		 * java.lang 패키지의 StringBuffer 또는 StringBuilder 클래스를 사용하면 좋다. 이 두 클래스는
		 * 내부 버퍼에 문자열을 저장해 두고, 그 안에서 추가, 수정, 삭제 작업을 한다.
		 */
		StringBuilder sb = new StringBuilder();

		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());

		sb.insert(4, "2");
		System.out.println(sb.toString());

		sb.setCharAt(4, '6');
		System.out.println(sb.toString());

		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());

		sb.delete(4, 5);
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.println("총문자수 : " + length);

		String result = sb.toString();
		System.out.println(result);
	}

}
