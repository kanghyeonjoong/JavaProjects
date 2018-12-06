package sec10.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		/*
		 * PatternŬ����
		 * java.util.regex.Pattern Ŭ������ �����޼ҵ� matches()��
		 * ���ڿ��� ���� ǥ�������� �����ϴ� ����̴�.
		 */
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";//����ǥ����
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angle1234@naver.com";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

	}

}
