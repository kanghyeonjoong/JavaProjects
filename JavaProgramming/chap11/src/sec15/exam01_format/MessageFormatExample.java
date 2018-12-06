package sec15.exam01_format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		/*
		 * ���ڿ� ���� Ŭ����(MessageFormat)
		 * java.text.MessageFormat Ŭ������ ����ϸ� ���ڿ��� �����Ͱ� �� �ڸ��� ǥ���� �ΰ�, ���α׷��� �����ϸ鼭
		 * �������� �����͸� ������ ���ڿ��� �ϼ���ų �� �ִ�.
		 */
		String id = "java";
		String name = "�ſ��";
		String tel = "010-123-1234";

		String text = "ȸ�� ID: {0} \nȸ�� �̸�: {1}\nȸ�� ��ȭ: {2}";
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);
		System.out.println();

		/* MessageFormat.format(pattern, arguments)�� arguments���� �ε��� ������ �°� ���� �����ϰų� �迭�� �����Ѵ�. */
		String sql = "insert into member values( {0}, {1}, {2} )";
		String result2 = MessageFormat.format(sql, new Object[] { "java", "�ſ��", "010-123-1234" });
		System.out.println(result2);
	}

}
