package sec07.exam02_string_method;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2));

		/*
		 * ���ĺ� ��,�빮�� ����(toLowerCase(), toUpperCase())
		 * toLowerCase(), toUpperCase()�޼ҵ�� �ҹ���, �빮�ڷ� �ٲ� ���ο� ���ڿ��� ������ �� �����Ѵ�.
		 */
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));

		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
